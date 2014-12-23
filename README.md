CSci211.E1.java
===============

Exercise #1 for CSci 211. 

csci 211 Exercise 1
Test Driven Development of Circular Arrays
Due: Monday, September 16, 20131
This assignment provides exposure and experience with the Eclipse debugger, JUnit testing, test
driven development and implementing a simple data structure.
Overview
This assignment asks you to write a CircularArray class and the associated JUnit tests that will
verify correctness.
What is provided
You should find an eclipse project archive on blackboard that you can import directly into
eclipse. Be sure to select “Existing Project into WorkSpace”, as shown below. You’ll then choose
“Select Archive File” on the next screen.
Choose the archive that you downloaded from blackboard, and you should have a valid Eclipse
project to work with. You’ll notice that the project contains several files. E1.java is very dull, and
can be ignored. It doesn’t actually use CircularArray at all, because you will make a JUnit test
that exercises your code instead. However, CircularArray.java has a simple class definition that
refers to the IntegerQueue interface, and some comments.
Javadoc
Javadoc is a standard java tool that builds html documentation out of the comments in java files.
For javadoc to recognize a comment, it must start with /** rather than simply /*. Documentation
for a project can be built using the “Generate Javadoc...” item under the Project menu. For this
1 Assignments are not considered late until 8AM the following morning. After that, a late penalty of 5% per
day will be applied up to seven days, after which the assignment cannot be accepted.
exercise, you’ll find javadoc has already been generated for you that describes the desired behavior
of the methods in CircularArray, but the methods themselves have since been removed.
You’ll want to read this documentation to find out what methods of CircularArray must be implemented,
and what those methods do. The screenshot below shows that the project e1dist has
a doc folder (in the Package Explorer View on the left) and that index.html in this folder can be
viewed using Eclipse’s built-in web browser.
Test Driven Development
As described in class, this exercise is meant to give you experience with Test Driven Development.
The idea is that before (or at least as) you write your code, you’ll also write tests to verify
correctness. Eclipse makes this extremely easy, as we’ve seen.
What to do
There’s already a CircularArray.java file, so you’ll want to make a JUnit test to go with it. Just
select CircularArray.java in the PackageExplorer, and right-click. Select New, then JUnit Test
Case. The default values in the dialog box that comes up are probably fine, so hit finish.
You now have a file named CircularArrayTest.java in your project. You can select this file in the
package explorer, and select Run As..., then choose JUnit Test. We saw in class that there’s a
convenient JUnit view that shows whether tests have failed or succeeded.
Now it’s time to start writing tests and then implementing methods of CircularArray, as described
in the javadoc. I suggest starting with some very simple methods and tests, and then
building up from there. Think carefully about all the possible ways in which your code could
fail, and test for them. (for example, does your code behave properly when dequeue() is called on
an empty CircularArray?)
Here’s a few example tests that you might try out in CircularArrayTest, once you’ve got the corresponding
code. These show the syntax that you’ll need to use:
This first one succeeds only if getCapacity() returns 5.
@Test
public void testCapacity1() {
CircularArray c = new CircularArray(5);
assertEquals(5, c.getCapacity());
}
This next one checks that isEmpty() returns True.
@Test
public void empty1() {
CircularArray c = new CircularArray(5);
assertTrue(c.isEmpty());
}
Lastly, here’s a test that expects an exception to be thrown:
@Test(expected=IllegalArgumentException.class)
public void constructor1() {
CircularArray c = new CircularArray(0);
}
Submission
It is important to put your name on all of your files. It also important to make a single zip archive
(not 7zip, or any other weird formats) containing your project. You can do this from inside
Eclipse using Export... under the File menu. Next, submit your archive file via blackboard. Be
sure to complete the blackboard submission process entirely.
