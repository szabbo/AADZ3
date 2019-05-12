package hr.ferit.zeljkosabo.mycv.ui.activities

import android.widget.ArrayAdapter
import hr.ferit.zeljkosabo.mycv.R
import hr.ferit.zeljkosabo.mycv.model.EducationAndTraining
import hr.ferit.zeljkosabo.mycv.model.User
import hr.ferit.zeljkosabo.mycv.ui.activities.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getLayoutResourceId() = R.layout.activity_main

    override fun setUpUi() {
        val user = User()
        user.fillUsersInformation(user)
        showUserInfo(user)
    }

    private fun showUserInfo(user: User) {
        tv_fullName.text = user.personalInfo.fullName
        tv_address.text = user.personalInfo.address
        tv_phoneNumber.text = user.personalInfo.phoneNumber
        tv_email.text = user.personalInfo.email

        val experience = mutableListOf<String>()
        user.workExperience.forEach {
            experience.add(it.start)
            experience.add(it.end)
            experience.add(it.companyName)
            experience.add(it.jobDescription)
        }
        list_workExperience.adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1, user.workExperience.flatMap {
                listOf(
                    "\nJob Started: ${it.start} \nJob Ended: ${it.end}\nCompany Name: ${it.companyName}\nJob Description: ${it.jobDescription}"
                )
            }
        )

        val education = mutableListOf<String>()
        user.educationAndTraining.forEach {
            education.add(it.start)
            education.add(it.end)
            education.add(it.title)
            education.add(it.placeOfObtaining)
        }
        list_educationAndTraining.adapter =
            ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, user.educationAndTraining.flatMap {
                    listOf(
                        "\nEducation Started: ${it.start} \nEducation Ended: ${it.end}\nReceived Title: ${it.title}\nEducation Facility: ${it.placeOfObtaining}"
                    )
                }
            )

        val job = mutableListOf<String>()
        user.jobRelatedSkills.forEach {
            job.add(it.skill)
        }
        list_jobRelatedSkills.adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1, user.jobRelatedSkills.flatMap {
                listOf("\n- ${it.skill}")
            }
        )
    }
}