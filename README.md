# cs100f2019-lab4-solution

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the solution for Laboratory 4 in Computer Science 100.

## Introduction

This assignment requires a programmer to implement and test a Java program,
called `MusicGenerator`, that will produce auditory output demonstrating the
musical pieces while using JFugue library. First, the program will read in
the user's choice of the instrument and a tempo from the text file.
Then, it will read in musical strings from the text file and create three
distinct musical pieces, with one of the pieces randomly generated from the
musical strings. Finally, the program will randomly play one of the pieces
according to the user's preference of the instrument and tempo. As verified by
[Checkstyle](https://github.com/checkstyle/checkstyle), the source code for the
`MusicGenerator.java` file must adhere to all of the requirements in the [Google
Java Style Guide](https://google.github.io/styleguide/javaguide.html).

The programmer is also responsible for writing a three-paragraph reflection,
stored in the file `writing/reflection.md`, that explains the challenges that
you faced and the solutions you developed while working on this assignment, as
well as the theme outlining your musical pieces, a general team-working strategy,
and your reflection on the Alexander String quartet's visit.
This is a Markdown file that must adhere to the standards described
in the [Markdown Syntax
Guide](https://guides.github.com/features/mastering-markdown/). Remember, you
can preview the contents of a committed Markdown file by clicking on the name of
the file in your GitHub repository.

The source code in the `MusicGenerator.java` file must also pass additional tests
set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader). As
before, GatorGrader will check to ensure `MusicGenerator` uses the `new Date()`
construct in the Java code. Moreover, GatorGrader will check the following
characteristics of your implementation:

* The `MusicGenerator` program must:
  * Contain at least six single-line comments and two multi-line comments
  * Include at least 5 `println` statements
  * Include at least 1 `else if` statement
  * Include at least 2 `if` statements
  * Use at least 2 `nextInt` methods
  * Use at least 2 `File` declarations
  * Use at least 3 `Pattern` declarations
  * Include at least 2 `Random` declarations
  * Include at least 5 `String` variables
  * Create and play music pieces as outlined in the
    assignment sheet

A carefully formatted assignment sheet for this project provides more details
about the steps that a computer scientist should take to complete this
assignment. You can view this assignment sheet by visiting the listing of
laboratories on the course web site.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides.

To do well on this assignment, you should also review Chapter 3 and study
Sections 5.1 through 5.3. Please see the course instructor or one of the
teaching assistants or tutors if you have questions about any of these reading
assignments.

## System Commands

This project invites students to enter system commands into a terminal window.
This assignment uses [Docker](https://www.docker.com) to deliver programs, such
as `gradle` and the source code and packages needed to run
[GatorGrader](https://github.com/GatorEducator/gatorgrader), to a students'
computer, thereby eliminating the need for a programmer to install them on their
development workstation. Individuals who do not want or can not install Docker can
optionally install of the programs mentioned in the [Project
Requirements](#requirements) section of this document. Once all the required
programs are installed locally on a machine, a software developer can type the
various `gradle` commands directly in the terminal.

### Using Docker

Once you have installed [Docker
Desktop](https://www.docker.com/products/docker-desktop), you can use the
following `docker run` command to start `gradle grade` as a containerized
application, using the [DockaGator](https://github.com/GatorEducator/dockagator)
Docker image available on
[DockerHub](https://cloud.docker.com/u/gatoreducator/repository/docker/gatoreducator/dockagator).

```bash
docker run --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator
```

The aforementioned command will use `"$(pwd)"` (i.e., the current directory) as
the project directory and `"$HOME/.dockagator"` as the cached GatorGrader
directory. Please note that both of these directories must exist, although only
the project directory must contain something. Generally, the project directory
should contain the source code and technical writing of this assignment, as
provided to a student through GitHub. Additionally, the cache directory should
not contain anything other than directories and programs created by DockaGator,
thus ensuring that they are not otherwise overwritten during the completion of
the assignment. To ensure that the previous command will work correctly, you
should create the cache directory by running the command `mkdir
$HOME/.dockagator`. If the above `docker run` command does not work correctly on
the Windows operating system, you may need to instead run the following command
to work around limitations in the terminal window:

```bash
docker run --rm --name dockagator \
  -v "$(pwd):/project" \
  -v "$HOME/.dockagator:/root/.local/share" \
  gatoreducator/dockagator
```

Since the above `docker run` command uses a Docker images that, by default, runs
`gradle grade` and then exits the Docker container, you may want to instead run
the following command so that you enter an "interactive terminal" that will
allow you to repeatedly run commands within the Docker container.

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

Once you have typed this command, you can use the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) in the Docker container by
typing the command `gradle grade` in your terminal. Running this command will
produce a lot of output that you should carefully inspect. If GatorGrader's
output shows that there are no mistakes in the assignment, then your source code
and writing are passing all of the automated baseline checks. However, if the
output indicates that there are mistakes, then you will need to understand what
they are and then try to fix them.

Here are some additional commands that you may need to run when using Docker:

* `docker info`: display information about how Docker runs on your workstation
* `docker images`: show the Docker images installed on your workstation
* `docker container list`: list the active images running on your workstation
* `docker system prune`: remove many types of "dangling" components from your workstation
* `docker image prune`: remove all "dangling" docker images from your workstation
* `docker container prune`: remove all stopped docker containers from your workstation
* `docker rmi $(docker images -q) --force`: remove all docker images from your workstation

### Using Gradle

You can complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is correct) the program using the command `gradle
build`. Here are some other commands that you can type:

* `gradle grade`: run the [GatorGrader](https://github.com/GatorEducator/gatorgrader) tool to check your work
* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (i.e., "home base")
directory for this assignment where the `build.gradle` file is located.

## Output

Due to the nature of this program, typing the command
`gradle run` in the terminal window produces textual and auditory output. Your program must adhere to
all of the requirements for the assignment and pass all of the verification
checks.

## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 100 Lab 4
Starter](https://github.com/allegheny-computer-science-100-01-f2019/lab04-starter)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks you
assignment, then you can follow the aforementioned steps to create an issue in
its repository. To ensure that your issue is properly resolved, please provide
as many details as is possible about the problem that you experienced.
Students who find, and use the appropriate GitHub issue tracker to correctly
document, a mistake in any aspect of this laboratory assignment will receive
extra credit towards their grade for it.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a teaching assistant during the laboratory
session. Alternatively, you may ask questions in the Slack team for this
course. Finally, you can schedule a meeting during the course instructor's
office hours.
