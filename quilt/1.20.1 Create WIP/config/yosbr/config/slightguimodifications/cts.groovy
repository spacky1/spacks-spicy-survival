// Here is the groovy file for screen elements
info("Hello From 'Slight' Gui Modifications cts script")

mainMenu {
    enabled = true // Set to true to enable this module

    splashText {
        enabled = true // Set to true to enable this module
        splashesEnabled = false // Set to false to disable splashes entirely

        customSplashes {
            enabled = false // Set to true to enable this module
            // You can put either "override" or "append" here to declare how you want to provide custom splashes
            applyMode = "override"
            defineCustom(["Wood", "Potato", "Stone"])
        }
    }

    background {
        clearBackgrounds() // This line removes the rotating cube
        backgroundStayLength = 7500 // This sets the length a background would stay
        backgroundFadeLength = 2500 // This sets the fade duration to another background
        renderGradientShade = false // This sets whether the slight shade should be rendered
        image {
            texture = file("backgrounds/bg1.jpg")
        }
        image {
            texture = file("backgrounds/bg2.jpg")
        }
        image {
            texture = file("backgrounds/bg3.jpg")
        }
        image {
            texture = file("backgrounds/bg4.jpg")
        }
        image {
            texture = file("backgrounds/bg5.jpg")
        }
        image {
            texture = file("backgrounds/bg6.jpg")
        }
        image {
            texture = file("backgrounds/bg7.jpg")
        }
        image {
            texture = file("backgrounds/bg8.jpg")
        }
        image {
            texture = file("backgrounds/bg9.jpg")
        }
        image {
            texture = file("backgrounds/bg10.jpg")
        }
        image {
            texture = file("backgrounds/bg11.jpg")
        }
        image {
            texture = file("backgrounds/bg12.jpg")
        }
        image {
            texture = file("backgrounds/bg13.jpg")
        }
        image {
            texture = file("backgrounds/bg14.jpg")
        }
        image {
            texture = file("backgrounds/bg15.jpg")
        }
        image {
            texture = file("backgrounds/bg16.jpg")
        }
        image {
            texture = file("backgrounds/bg17.jpg")
        }
        image {
            texture = file("backgrounds/bg18.jpg")
        }
        image {
            texture = file("backgrounds/bg19.jpg")
        }
        image {
            texture = file("backgrounds/bg20.jpg")
        }
        image {
            texture = file("backgrounds/bg21.jpg")
        }
        image {
            texture = file("backgrounds/bg22.jpg")
        }
        image {
            texture = file("backgrounds/bg23.jpg")
        }
        image {
            texture = file("backgrounds/bg24.jpg")
        }
        image {
            texture = file("backgrounds/bg25.jpg")
        }
        image {
            texture = file("backgrounds/bg26.jpg")
        }
        image {
            texture = file("backgrounds/bg27.jpg")
        }
        image {
            texture = file("backgrounds/bg28.jpg")
        }
        image {
            texture = file("backgrounds/bg29.jpg")
        }
        image {
            texture = file("backgrounds/bg30.jpg")
        }
        image {
            texture = file("backgrounds/bg31.jpg")
        }
        image {
            texture = file("backgrounds/bg32.jpg")
        }
        image {
            texture = file("backgrounds/bg33.jpg")
        }
        image {
            texture = file("backgrounds/bg34.jpg")
        }
        image {
            texture = file("backgrounds/bg35.jpg")
        }
        image {
            texture = file("backgrounds/bg36.jpg")
        }
        image {
            texture = file("backgrounds/bg37.jpg")
        }
        image {
            texture = file("backgrounds/bg38.jpg")
        }
        image {
            texture = file("backgrounds/bg39.jpg")
        }
        image {
            texture = file("backgrounds/bg40.jpg")
        }
        image {
            texture = file("backgrounds/bg41.jpg")
        }
        image {
            texture = file("backgrounds/bg42.jpg")
        }
        image {
            texture = file("backgrounds/bg43.jpg")
        }
        image {
            texture = file("backgrounds/bg44.jpg")
        }
        image {
            texture = file("backgrounds/bg45.jpg")
        }
    }

    removeMinecraftLogo()
    removeEditionBadge()
    clearAllLabels()
    // clearAllButtons()

    label {
        position {
            x { it - 2 }
            y = -9
        }
        text = literal("v0.1.0")
        align = "right"
        color = 0xFFFFFF
        hoveredColor = 0xFFFF55
        shadow = true
        onClicked = url("https://youtu.be/0tdyU_gW6WE")
    }
}