# Project Zomboid Planner

A web application designed to help players of *Project Zomboid* plan and manage safe locations and resources in the game’s post-apocalyptic world. Built with Spring Boot for the backend and a custom Bootstrap-based frontend, this project provides a simple interface to add and store place details, including coordinates and associated items.

## Overview

This application allows users to:
- Add new locations (e.g., safehouses, resource points) with descriptions, city names, and coordinates.
- Associate items (e.g., tools, supplies) with each location.
- Store data persistently using a PostgreSQL database.
- Access a responsive, dark-themed interface optimized for desktop and mobile devices.

## Features
- **Location Management:** Add and save places with custom descriptions and coordinates (X, Y, Z).
- **Item Association:** Link items to locations for better resource planning.
- **Responsive Design:** Built with Bootstrap 5 for a seamless experience across devices.
- **Dark Theme:** Custom styling for an immersive *Project Zomboid* aesthetic.
- **Database Integration:** Uses Spring Data JPA with Hibernate for data persistence.

## Technologies
- **Backend:** Spring Boot 3.5.4, Spring Data JPA, Hibernate 6.6.22.Final
- **Database:** PostgreSQL
- **Frontend:** HTML5, CSS3, Bootstrap 5.3.2, Thymeleaf
- **Build Tool:** Maven
- **Static Resources:** Custom CSS hosted in `src/main/resources/static/`

## Prerequisites
- Java 17 or higher
- PostgreSQL 15+ (with a database named `pz_planner` or adjust the `application.properties`)
- Maven 3.6+
- Git (for cloning the repository)

## Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/seu-usuario/project-zomboid-planner.git
   cd project-zomboid-planner
