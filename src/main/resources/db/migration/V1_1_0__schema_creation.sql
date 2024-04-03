CREATE TABLE IF NOT EXISTS courses (
    course_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    count_lessons INT,
    user_level INT
);
CREATE TABLE IF NOT EXISTS lessons (
    lesson_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    time_to_watch INT,
    course_id INT REFERENCES courses(course_id),
    video_path VARCHAR(255),
    text_information TEXT
);
CREATE TABLE IF NOT EXISTS users (
    user_id INT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    active BOOLEAN,
    user_level INT,
    is_admin BOOLEAN
);
CREATE TABLE IF NOT EXISTS users_activity (
    id INT PRIMARY KEY,
    user_id INT REFERENCES users(user_id),
    course_id INT REFERENCES courses(course_id),
    is_end BOOLEAN
);