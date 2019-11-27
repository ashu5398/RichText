# RichText

RichText is a text decoration library as the one we use in flutter. Most of the times, we have the requirements to apply different style to the text in the same TextView which is not possible in general until you use HTML. This library gives you the method that helps you to do this without any extra work and HTML strings of course. It handles those Strings in background by itself.

# Installation
**Add this to your Root gradle file**

	allprojects {
			repositories {
				...
				maven { url 'https://jitpack.io' }
			}
		}
Add this to your Build Gradle File

    implementation 'com.github.ashu5398:RichText:0.0.2'


# Basic Usage

What you need to do is to just call the makeText function and it will return you the string to set it in the TextView text field. Let me show you

    val text = RichText().make(
	    TextSpan("I have read and accept the", TextStyle(bold = true, underline = true, fontSize = 20),false),
	    TextSpan(" terms and condition.", TextStyle(textColor = "#149fcc",link = "https://www.google.com"),false)
    )
    tv_test.text = text
Just pass as many TextSpan as you want. Each TextSpan takes a text which is mandatory of course and a TextStyle object which defines its styling. More information for each of the class is below.

## TextSpan

It takes 2 fields in its constructor:-

 - **text**: Just pass a string you want in this TextSpan
 - **style**: pass a TextStyle() object only if you need to apply any style on it.
 - **isNewLine(True/False)**: By default, it is false but you can set it to true, if you want to show a new Line after this span.

## TextStyle

It takes following fields in its constructor:-

 - **bold(True/False)**: By default, it is false.
 - **underLine(True/False)**: By default, it is false.
 - **italic(True/False)**: By default, it is false.
 - **textColor**: Give a color code in string format e.g. "#149fcc". By default, it is black.
 - **isSmall(True/False)**: By default, it is false. However make it true if you want this span to be small than others. It will make it to 60% of original size.
 - **link**: Provide link in String if you want this text to open a link.

> Note:- If you are using link property, you need to change the movement
> method of your TextView to tell Android that this is a link. Please
> put following line:

    textView.movementMethod = LinkMovementMethod()
