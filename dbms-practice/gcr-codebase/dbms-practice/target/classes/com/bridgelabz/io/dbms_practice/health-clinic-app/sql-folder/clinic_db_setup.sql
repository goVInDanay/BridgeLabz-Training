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

CREATE TABLE IF NOT EXISTS visits (
    id INT AUTO_INCREMENT PRIMARY KEY,
    appointment_id INT NOT NULL,
    visit_date DATE NOT NULL,
    diagnosis VARCHAR(255) NOT NULL,
    notes TEXT,

    CONSTRAINT fk_visit_appointment 
        FOREIGN KEY (appointment_id) REFERENCES appointments(id)
);

CREATE TABLE IF NOT EXISTS bills (
    id INT AUTO_INCREMENT PRIMARY KEY,
    visit_id INT NOT NULL,
    consultation_fee DOUBLE NOT NULL,
    additional_charges DOUBLE DEFAULT 0,
    total_amount DOUBLE NOT NULL,
    payment_status VARCHAR(20) DEFAULT 'UNPAID',
    bill_date DATE NOT NULL,

    CONSTRAINT fk_bill_visit 
        FOREIGN KEY (visit_id) REFERENCES visits(id)
);

