package com.kellsaro.turbonativeandroid

import dev.hotwire.turbo.fragments.TurboWebFragment
import dev.hotwire.turbo.nav.TurboNavGraphDestination

@TurboNavGraphDestination(uri = "turbo://fragment/web")
class WebFragment : TurboWebFragment()