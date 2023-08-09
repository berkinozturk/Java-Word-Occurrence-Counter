# Java-Word-Occurrence-Counter
The purpose of the provided Java code is to develop a program that counts the occurrences of the word "Java" in multiple text files concurrently. The program utilizes multithreading to achieve parallel processing, enhancing efficiency when dealing with multiple files. Each file is associated with a separate thread, allowing for simultaneous file reading and word counting. By implementing this approach, the code demonstrates how to leverage the power of threads to perform tasks in parallel, thereby optimizing the time taken for processing multiple files. This example serves as a practical demonstration of multithreading concepts and showcases how to handle file I/O operations within a multi-threaded environment, which can be useful in scenarios where processing efficiency is crucial, such as when working with large datasets or performing computationally intensive tasks.

## Features

- Utilizes multithreading for concurrent file processing.
- Demonstrates how to handle file I/O operations within a multi-threaded environment.
- Provides insights into the power of parallel processing for optimizing tasks.
- Easy-to-understand example for learning multithreading concepts in Java.

## Usage

1. Clone this repository to your local machine.
2. Modify the file paths in the `Main` class to point to your text files.
3. Compile and run the program using your preferred Java compiler.
4. The program will count the occurrences of the word "Java" in each file and display the results.

## Files

- `Main.java`: Contains the main class to initiate multithreaded processing.
- `MyThread.java`: Defines the custom thread class for counting word occurrences.

## Example Text Files

Three example text files (`file1.txt`, `file2.txt`, and `file3.txt`) are provided in the repository. These files contain sample content for testing the program.


