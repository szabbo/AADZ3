package hr.ferit.zeljkosabo.mycv.model

import hr.ferit.zeljkosabo.mycv.common.FillUserInfo

class User(
    val personalInfo: PersonalInfo = PersonalInfo(),
    val workExperience: MutableList<WorkExperience> = mutableListOf(),
    val educationAndTraining: MutableList<EducationAndTraining> = mutableListOf(),
    val jobRelatedSkills: MutableList<JobRelatedSkills> = mutableListOf()
) : FillUserInfo {
    override fun fillUsersInformation(user: User) {
        addPersonalInfo(
            this,
            "Željko Sabo",
            "Jadranska 36, \n34551 Lipik,",
            "(+385) 99 500 1562",
            "zeljko.sabo@yahoo.com"
        )

        addWorkExperience(this, "1 Nov 2016", "30 Nov 2017", "Hrvatski Telekom dd", "Customer Tech Support Agent")

        addEducationAndTraining(
            this,
            "1 Oct 2018",
            "Present",
            "Master of Science in Computer Engineering",
            "Faculty of Electrical Engineering, Computer Science and Information Technology, \n" +
                    "Osijek (Croatia)"
        )

        addEducationAndTraining(
            this,
            "1 Oct 2014",
            "30 Sept 2018",
            "Bachelor of Science in Computer Engineering",
            "Faculty of Electrical Engineering, Computer Science and Information Technology, \n" +
                    "Osijek (Croatia)"
        )

        addEducationAndTraining(
            this,
            "1 Sept 2010",
            "1 Jun 2014",
            "Computer Technician",
            "Technical School Daruvar, \nDaruvar (Croatia)"
        )

        addJobRelatedSkills(this, "good knowledge of C and C++")
        addJobRelatedSkills(this, "good knowledge of Unity and C#")
        addJobRelatedSkills(this, "basic knowledge of Java")
        addJobRelatedSkills(this, "basic knowledge of Kotlin and Android Studio")
        addJobRelatedSkills(this, "basic knowledge of SQL/MySQL")
        addJobRelatedSkills(this, "basic knowledge of Git")
    }

    override fun addPersonalInfo(user: User, fullName: String, address: String, phoneNumber: String, email: String) {
        this.personalInfo.fullName = fullName
        this.personalInfo.address = address
        this.personalInfo.phoneNumber = phoneNumber
        this.personalInfo.email = email
    }

    override fun addWorkExperience(user: User, start: String, end: String, companyName: String, jobDescription: String) {
        val experience = WorkExperience(start, end, companyName, jobDescription)
        this.workExperience.add(experience)
    }

    override fun addEducationAndTraining(
        user: User,
        start: String,
        end: String,
        title: String,
        placeOfObtaining: String
    ) {
        val education = EducationAndTraining(start, end, title, placeOfObtaining)
        this.educationAndTraining.add(education)
    }

    override fun addJobRelatedSkills(user: User, skill: String) {
        val skill = JobRelatedSkills(skill)
        this.jobRelatedSkills.add(skill)
    }

}