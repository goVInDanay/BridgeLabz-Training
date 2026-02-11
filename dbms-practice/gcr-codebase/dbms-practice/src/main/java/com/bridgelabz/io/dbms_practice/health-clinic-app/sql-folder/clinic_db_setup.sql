CREATE DATABASE IF NOT EXISTS clinic;
USE clinic;

CREATE TABLE IF NOT EXISTS patients (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    dob DATE NOT NULL,
    phone VARCHAR(15) UNIQUE NOT NULL,
    address VARCHAR(255),
    blood_group VARCHAR(5)
);

CREATE TABLE IF NOT EXISTS appointments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL,
    status VARCHAR(20) NOT NULL DEFAULT 'SCHEDULED',

    CONSTRAINT fk_patient FOREIGN KEY (patient_id) REFERENCES patients(id),
    CONSTRAINT fk_doctor FOREIGN KEY (doctor_id) REFERENCES doctors(id)
);

create table specialties (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name varchar(100) NOT NULL UNIQUE
);

Create table doctors(
    -> id INT auto_increment primary key,
    -> name varchar(100) not null,
    -> specialization varchar(100) not null,
    -> contact varchar(15) unique not null,
    -> consultation_fee double not null,
    -> is_active boolean default true
);

alter table doctors
    -> add column specialty_id INT,
    -> add constraint fk_specialty
    -> foreign key(specialty_id) references specialties(id
);