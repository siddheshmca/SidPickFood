CREATE TABLE customer (
    cust_id INT PRIMARY KEY,
    cust_Name VARCHAR(100),
    cust_Addr VARCHAR(255),
    cust_Phone_No BIGINT);

CREATE TABLE restaurant (
    rest_id INT PRIMARY KEY,
    rest_name VARCHAR(100),
    rest_location VARCHAR(255),
    rest_category VARCHAR(255),
    rest_menu VARCHAR(255),
    rest_phone_no BIGINT);

CREATE TABLE cust_addr (
    cust_addr_id INT PRIMARY KEY,
    cust_id INT UNIQUE,
    cust_flat_num INT,
    cust_floor_num INT,
    cust_wing VARCHAR(10),
    cust_bldg_name VARCHAR(100),
    cust_society_name VARCHAR(100),
    cust_street_name VARCHAR(100),
    cust_area VARCHAR(100),
    cust_city VARCHAR(50),
    cust_state VARCHAR(50),
    cust_pin_code INT,
    CONSTRAINT fk_cust_addr_customer
      FOREIGN KEY (cust_id)
      REFERENCES customer(cust_id));

CREATE TABLE rest_addr (
    rest_addr_id INT PRIMARY KEY,
    rest_id INT,
    rest_shop_no INT,
    rest_street_name VARCHAR(100),
    rest_floor_num INT,
    rest_area VARCHAR(100),
    rest_city VARCHAR(100),
    rest_state VARCHAR(100),
    rest_pin_code INT,
    FOREIGN KEY (rest_id) REFERENCES restaurant(rest_id));


CREATE TABLE cust_food_order (
	cf_order_id INT PRIMARY KEY
	,rest_id INT
	,cust_id INT
	,cust_Phone_No BIGINT
	,cust_addr_id INT
	,cf_order_date TIMESTAMP
	,cf_order_items VARCHAR(255)
	,cf_price_items DOUBLE
	,cf_order_quantity DOUBLE
	,cf_order_amount DOUBLE
	,cf_order_status VARCHAR(50)
	,CONSTRAINT fk_order_restaurant FOREIGN KEY (rest_id) REFERENCES restaurant(rest_id)
	,CONSTRAINT fk_order_customer FOREIGN KEY (cust_id) REFERENCES customer(cust_id)
	,CONSTRAINT fk_order_customer_address FOREIGN KEY (cust_addr_id) REFERENCES cust_addr(cust_addr_id));
	
CREATE TABLE payment (
	payment_id INT PRIMARY KEY
	,cust_id INT
	,cf_order_id INT
	,rest_id INT
	,payment_total_amount DOUBLE
	,payment_mode VARCHAR(50)
	,payment_status VARCHAR(50)
	,CONSTRAINT fk_payment_customer FOREIGN KEY (cust_id) REFERENCES customer(cust_id)
	,CONSTRAINT fk_payment_order FOREIGN KEY (cf_order_id) REFERENCES cust_food_order(cf_order_id)
	,CONSTRAINT fk_payment_restaurant FOREIGN KEY (rest_id) REFERENCES restaurant(rest_id));


CREATE TABLE menu (
	menu_id INT PRIMARY KEY
	,rest_id INT
	,menu_items VARCHAR(255)
	,menu_item_price DOUBLE
	,CONSTRAINT fk_menu_restaurant FOREIGN KEY (rest_id) REFERENCES restaurant(rest_id));