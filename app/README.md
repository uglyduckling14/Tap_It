# Tap It!

## Main

LEVEL 1

    The game displays a randomly selected color, either red, blue, yellow, or green, in a small box at the top of the screen.
    Below the color is a grid of colored squares (or circles or rounded squares or buttons it doesn't really matter). They are colored with one of 4 colors: red, blue, green, and yellow.
    The user taps on a square that matches the color at the top
    If the player taps on the wrong color then they lose.
    If the player taps on the right color then they move on to the next level.

LEVEL 2 AND ONWARD (this is where it gets fun)

    A new randomly selected color is chosen and displayed at the top of the screen.
    The player must remember the sequence of previous colors and press them in order first, before tapping on the square with the new color.
    If the player successfully taps squares with all of the previous colors in the right order and then taps on the square that matches the new color they succeed and move on to the next level.
    If the player fails to tap the colors in the right order then they lose.

The game goes on until the player loses. After the game is lost the player is presented with a button to restart the game.

### Pseudo

Generate random color-> separate class

If color picked matches color selected = next level
    add color to list of colors needed to be selected
Else:
    display restart button