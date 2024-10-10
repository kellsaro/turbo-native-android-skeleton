package com.kellsaro.turbonativeandroid

import androidx.fragment.app.Fragment
import dev.hotwire.turbo.config.TurboPathConfiguration
import dev.hotwire.turbo.session.TurboSessionNavHostFragment
import kotlin.reflect.KClass

class MainSessionNavHostFragment : TurboSessionNavHostFragment() {
    override val sessionName = "main"

    override val startLocation = "https://turbo-native-demo.glitch.me/"

    override val pathConfigurationLocation: TurboPathConfiguration.Location
        get() = TurboPathConfiguration.Location(
            assetFilePath = "json/configuration.json"
        )

    override val registeredFragments: List<KClass<out Fragment>>
        get() = listOf(
            WebFragment::class
        )
}