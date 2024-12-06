# Bootcamp Management System

## Overview
This project is a Java-based bootcamp management system designed to demonstrate object-oriented programming (OOP) principles such as inheritance, encapsulation, abstraction, and polymorphism. The system allows users to create and manage bootcamps, enroll in courses and mentoring sessions, track progress, and calculate experience points (XP).

## Features

- **Course Management**: Add courses with specific titles, descriptions, and workloads.
- **Mentoring Sessions**: Create mentoring sessions with titles, descriptions, and scheduled dates.
- **Developer Progress Tracking**: Enroll developers in bootcamps and track their progress in completing courses and mentoring.
- **XP Calculation**: Calculate XP based on completed content, with different XP values for courses and mentoring.
- **Enrollment Management**: Manage and display content that developers are enrolled in and completed.

## How It Works

1. **Creating Courses and Mentoring Sessions**:
   - Courses and mentoring sessions can be created and customized with titles, descriptions, and other relevant details.
   
2. **Bootcamp Creation**:
   - Bootcamps are created and populated with courses and mentoring sessions, with developers enrolling in them.

3. **Developer Interaction**:
   - Developers can enroll in a bootcamp, progress through content, and have their XP calculated based on their completed content.

4. **Progression**:
   - Developers can progress through their enrolled content by completing courses and mentoring sessions.

## Class Structure

### Main Classes

- **`Curso`**: Represents a course with a title, description, and workload. Extends `Conteudo`.
- **`Mentoria`**: Represents a mentoring session with a title, description, and date. Extends `Conteudo`.
- **`Dev`**: Represents a developer with personal details and sets of enrolled and completed content.
- **`Bootcamp`**: Represents a bootcamp with a name, description, and sets of enrolled developers and content.
- **`Conteudo`**: An abstract class that defines shared properties and methods for `Curso` and `Mentoria`.


