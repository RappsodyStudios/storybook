package OpenSourceProjects_Storybook.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = '8cc5f747-4ca7-4f0d-940d-b0c422f501a6-vue' (id = 'OpenSourceProjects_Storybook_Vue')
accordingly, and delete the patch script.
*/
changeBuildType("8cc5f747-4ca7-4f0d-940d-b0c422f501a6-vue") {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true
}
