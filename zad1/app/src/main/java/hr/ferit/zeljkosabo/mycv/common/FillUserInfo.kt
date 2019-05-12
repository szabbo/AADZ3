package hr.ferit.zeljkosabo.mycv.common

import hr.ferit.zeljkosabo.mycv.model.User

interface FillUserInfo {
    fun fillUsersInformation(user: User)
    fun addPersonalInfo(user: User, fullName: String, address: String, phoneNumber: String, email: String)
    fun addWorkExperience(user: User, start: String, end: String, companyName: String, jobDescription: String)
    fun addEducationAndTraining(user: User, start: String, end: String, title: String, placeOfObtaining: String)
    fun addJobRelatedSkills(user: User, skill: String)
}