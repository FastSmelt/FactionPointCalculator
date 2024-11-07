# Subtract Percentage Calculator (Faction Point Calculator)

## Overview

This is a simple Java GUI application that calculates 85% of a given number. I created this project because I was bored and wanted to experiment with creating a basic GUI calculator. It could be used as a faction point calculator or for any scenario where you need to subtract 15% from a value.

## Features

- The program provides a graphical user interface (GUI) with a text field to enter a number and a button to calculate the result.
- Upon clicking the "Calculate" button, the program subtracts 15% from the entered number and displays the result.
- If the input is invalid (i.e., not a number), it will display an error message.

## How to Use

1. Clone the repository and compile the code.
2. Run the application to open the GUI.
3. Enter a number in the text field.
4. Click the "Calculate" button to see the result with 15% subtracted.

## Code Explanation

The code uses Java Swing to create a simple GUI for user interaction. Here's a breakdown:

- **JFrame**: The main window of the application.
- **JPanel**: Holds the components like labels, buttons, and text fields.
- **JTextField**: Accepts user input.
- **JButton**: Triggers the calculation.
- **JLabel**: Displays text, including the result of the calculation.

The calculation itself is straightforward: it reads the number entered by the user, subtracts 15%, and updates the result label with the calculated value.

### Main Code Structure

- The `createAndShowGUI()` method sets up the window and its components.
- `calculateButton.addActionListener()` listens for the button click and performs the calculation, displaying either the result or an error message if the input is invalid.

### Example Usage

To use the calculator:
- Enter "100" and click "Calculate." The result will be "85.0".

## Requirements

- Java 8 or higher

## Project Motivation

I made this project simply because I was bored, and it was fun to explore Java Swing. The idea was also to create something that could act as a "faction point calculator," which could be useful in scenarios like games that involve resource management.

Feel free to expand on the code or use it as a base for your own projects!

## Future Improvements

- Add support for different percentage values.
- Improve the UI to make it more user-friendly.
- Add functionality for other arithmetic operations.
