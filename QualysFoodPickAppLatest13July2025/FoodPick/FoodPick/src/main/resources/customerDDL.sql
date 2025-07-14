CREATE TABLE customer (
    cust_id INT PRIMARY KEY,
    cust_Name VARCHAR(100),
    cust_Addr VARCHAR(255),
    cust_Phone_No BIGINT
);

CREATE TABLE restaurant (
    rest_id INT PRIMARY KEY,
    rest_name VARCHAR(100),
    rest_location VARCHAR(255),
    rest_category VARCHAR(255),
    rest_menu VARCHAR(255),
    rest_phone_no BIGINT
);

