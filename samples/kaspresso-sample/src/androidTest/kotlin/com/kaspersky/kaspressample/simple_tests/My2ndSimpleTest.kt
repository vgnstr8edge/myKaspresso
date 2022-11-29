package com.kaspersky.kaspressample.simple_tests


import android.Manifest
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.rule.GrantPermissionRule
import com.kaspersky.kaspressample.MainActivity
import com.kaspersky.kaspressample.R
import com.kaspersky.kaspressample.screen.CommonFlakyScreen
import com.kaspersky.kaspressample.screen.MainScreen
import com.kaspersky.kaspressample.screen.SimpleScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class My2ndSimpleTest : TestCase() {
    @get:Rule
    val runtimePermissionRule: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun test1() = run {
        step("Open Screen") {
            //testLogger.i("MY_PERSONAL_TEST")
            //device.screenshots.take("Additional_screenshot")
            MainScreen {
                simpleButton {
                    isVisible()
                    click()
                }
            }
        }

        step("Push buttons") {
            SimpleScreen {
                button1 {
                    click()
                    click()
                }

                button2 {
                    click()
                    click()
                }
            }
        }

        step("Screen shot") {
            device.screenshots.take("Make screenshot")
        }
    }



    @Test
    fun test2() = run {

        step("choose button") {
            MainScreen {
                simpleButton {
                    click()
                }
            }
        }

        step("Click button_2") {
            SimpleScreen {
                button1 {
                    click()
                }
                button2 {
                    isVisible()
                    click()
                }

            }
        }

        step("Put new text") {
                scenario(
                    CheckEditScenario()
                )
        }
    }

    @Test
    fun test3() = run {
        step("Push new button") {
            MainScreen {
                webViewButton {
                    click()
                }
            }
        }
    }
}

