package com.example.java_iii_project.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.Optional;


/**
 * The main controller for the Application
 *
 * This will handles GET, POST DELETE, and PUT requests
 *
 * @author Dawson
 *
 */
@RestController
@RequestMapping(path = "/api")
public class MainController {

    //Constants used in REST API definition
    public static final String API_ROOT_PATH = "/api";
    public static final String VERSION_1 = "/v1";
    public static final String EDUCATION = "/educations";
    public static final String EXPERIENCE = "/experience";
    public static final String SKILLS = "/skills";
//    public static final String EXPERIENCE= "/experience";


    /**
     * Education Repo
     */
    @Autowired  //This links this to the database
    private EducationRepository educationRepository;

    /**
     * get all education
     * @return all educationRepository
     */
    @GetMapping(path=VERSION_1 + EDUCATION)
    public @ResponseBody
    Iterable<Education> getAllEducations(){
        String name = "Test";
        return educationRepository.findAll();
    }

    /**
     * get education by id
     * @return educationRepository by id
     */
    @GetMapping(path = VERSION_1 + EDUCATION + "/{id}")
    public @ResponseBody
    Optional<Education> getEducationWithId(@PathVariable Integer id){
        String name = "Test";
        return educationRepository.findById(id);
    }

    /**
     * Add a new education to the resume
     * @param title title
     * @param institutionName institutionName
     * @param gradYear gradYear
     * @param startDate startDate
     * @param endDate endDate
     * @param abbreviation abbreviation
     * @return
     */
    @PostMapping(path=VERSION_1 + EDUCATION)
    public @ResponseBody
    String addNewEducation(@RequestParam String title,
                           @RequestParam String institutionName, @RequestParam Integer gradYear,
                           @RequestParam LocalDate startDate, @RequestParam LocalDate endDate,
                           @RequestParam String abbreviation){

        Education education = new Education();
        education.setTitle(title);
        education.setInstitutionName(institutionName);
        education.setGradYear(gradYear);
        education.setStartDate(startDate);
        education.setEndDate(endDate);
        education.setAbbreviation(abbreviation);
        educationRepository.save(education);
        return "Saved";
    }

    /**
     * delete education by id
     * @param id id
     * @return education repository by id
     */
    @DeleteMapping(path = VERSION_1 + EDUCATION)
    public @ResponseBody
    String deleteEducation(@RequestParam Integer id){
        educationRepository.deleteById(id);
        return "deleted";
    }

    /**
     * update education using id
     * @param id id
     * @param title title
     * @param institutionName institution name
     * @param gradYear grad year
     * @param startDate start date
     * @param endDate end date
     * @param abbreviation abbreviation
     * @return education by id
     */
    @PutMapping (path=VERSION_1 + EDUCATION)
    public @ResponseBody
    String updateEducation(@RequestParam Integer id, @RequestParam String title,
                           @RequestParam String institutionName, @RequestParam Integer gradYear,
                           @RequestParam LocalDate startDate, @RequestParam LocalDate endDate,
                           @RequestParam String abbreviation){

        Optional<Education> optionalEducation = educationRepository.findById(id);

        if(optionalEducation.isPresent()){
            Education education = optionalEducation.get();
            education.setTitle(title);
            education.setInstitutionName(institutionName);
            education.setGradYear(gradYear);
            education.setStartDate(startDate);
            education.setEndDate(endDate);
            education.setAbbreviation(abbreviation);
            educationRepository.save(education);
            return "Saved";

        } else {
            addNewEducation(title, institutionName, gradYear, startDate,
                    endDate, abbreviation);
            return "Does not exist - Added new education";
        }
    }


    /**
     * Experience Repo
     */
    @Autowired  //This links this to the database
    private ExperienceRepository experienceRepository;

    /**
     * get all experience
     * @return all of experience repo
     */
    @GetMapping(path=VERSION_1 + EXPERIENCE)
    public @ResponseBody
    Iterable<Experience> getAllExperience(){
        String name = "Test";
        return experienceRepository.findAll();
    }

    /**
     * get experience by id
     * @param id id
     * @return experience by id
     */
    @GetMapping(path = VERSION_1 + EXPERIENCE + "/{id}")
    public @ResponseBody
    Optional<Experience> getExperienceWithId(@PathVariable Integer id){
        String name = "Test";
        return experienceRepository.findById(id);
    }

    /**
     * add new Experience to the resume
     *
     * @param startDate start date
     * @param endDate end date
     * @param jobTitle job title
     * @param company company
     * @param description description
     * @return
     */
    @PostMapping(path=VERSION_1 + EXPERIENCE)
    public @ResponseBody
    String addNewExperience(@RequestParam LocalDate startDate,
                           @RequestParam LocalDate endDate, @RequestParam String jobTitle,
                           @RequestParam String company, @RequestParam String description){

        Experience experience = new Experience();
        experience.setStartDate(startDate);
        experience.setEndDate(endDate);
        experience.setJobTitle(jobTitle);
        experience.setCompany(company);
        experience.setDescription(description);
        experienceRepository.save(experience);
        return "Saved";
    }

    /**
     * delete experience by id
     * @param id id
     * @return experience repo
     */
    @DeleteMapping(path = VERSION_1 + EXPERIENCE)
    public @ResponseBody
    String deleteExperience(@RequestParam Integer id){
        experienceRepository.deleteById(id);
        return "deleted";
    }

    /**
     * update experience using id
     * @param id id
     * @param startDate startDate
     * @param endDate endDate
     * @param jobTitle jobTitle
     * @param company company
     * @param description description
     * @return experience
     */
    @PutMapping (path=VERSION_1 + EXPERIENCE)
    public @ResponseBody
    String updateExperience(@RequestParam Integer id, @RequestParam LocalDate startDate,
                            @RequestParam LocalDate endDate, @RequestParam String jobTitle,
                            @RequestParam String company, @RequestParam String description){

        Optional<Experience> optionalExperience = experienceRepository.findById(id);

        if(optionalExperience.isPresent()){
            Experience experience = optionalExperience.get();
            experience.setStartDate(startDate);
            experience.setEndDate(endDate);
            experience.setJobTitle(jobTitle);
            experience.setCompany(company);
            experience.setDescription(description);
            experienceRepository.save(experience);
            return "Saved";

        } else {
            addNewExperience(startDate, endDate, jobTitle, company, description);
            return "Does not exist - Added new experience!";
        }
    }


    /**
     * Skills Repo
     */
    @Autowired  //This links this to the database
    private SkillsRepository skillsRepository;

    /**
     * get all skills
     * @return skills repo
     */
    @GetMapping(path=VERSION_1 + SKILLS)
    public @ResponseBody
    Iterable<Skills> getAllSkills(){
        String name = "Test";
        return skillsRepository.findAll();
    }

    /**
     * get skill by id
     * @param id id
     * @return skill by id
     */
    @GetMapping(path = VERSION_1 + SKILLS + "/{id}")
    public @ResponseBody
    Optional<Skills> getSkillsWithId(@PathVariable Integer id){
        String name = "Test";
        return skillsRepository.findById(id);
    }

    /**
     * add new skill
     * @param name name
     * @param type type
     * @return skill repo
     */
    @PostMapping(path=VERSION_1 + SKILLS)
    public @ResponseBody
    String addNewSkills(@RequestParam String name,
                            @RequestParam String type){

        Skills skills = new Skills();
        skills.setName(name);
        skills.setType(type);
        skillsRepository.save(skills);
        return "Saved";
    }

    /**
     * delete skill by id
     * @param id id
     * @return skill to be deleted
     */
    @DeleteMapping(path = VERSION_1 + SKILLS)
    public @ResponseBody
    String deleteSkills(@RequestParam Integer id){
        skillsRepository.deleteById(id);
        return "deleted";
    }

    /**
     * update skill by id
     * @param id id
     * @param name name
     * @param type type
     * @return updated skill repo
     */
    @PutMapping (path=VERSION_1 + SKILLS)
    public @ResponseBody
    String updateSkills(@RequestParam Integer id, @RequestParam String name,
                        @RequestParam String type){

        Optional<Skills> optionalSkills = skillsRepository.findById(id);

        if(optionalSkills.isPresent()){
            Skills skills = optionalSkills.get();
            skills.setName(name);
            skills.setType(type);
            skillsRepository.save(skills);
            return "Saved";

        } else {
            addNewSkills(name, type);
            return "Does not exist - Added new skill";
        }
    }


}