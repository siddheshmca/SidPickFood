INSERT INTO customer (cust_id, cust_Name, cust_email, cust_Phone_No) VALUES 
(100001, 'Virat Kohli', 'virat@gmail.com',6578965789),
(100002, 'Rohit Sharma', 'rohit@gmail.com',7865478654),
(100003, 'Shreyas Iyer', 'shreyas@gmail.com',5467154671),
(100004, 'Arjun Tendulkar', 'arjun@gmail.com',9432694326),
(100005, 'Sunil Gavaskar', 'sunny@gmail.com',6785467854),
(100006, 'Dilip Vengsarkar', 'dilip@gmail.com',4897648976),
(100007, 'Ravi Shastri', 'ravi@gmail.com',8546785467),
(100008, 'Sandeep Patil', 'sandeep@gmail.com',9345693456),
(100009, 'Pravin Amre', 'pravin@gmail.com',8342183421),
(100010, 'Ajinkya Rahane', 'ajju@gmail.com',9346793467);


INSERT INTO restaurant (rest_id, rest_name, rest_location, rest_menu, rest_phone_no) VALUES 
(200001, 'One 8', 'Worli','', 1234512345),
(200002, 'Vegan Bistro', 'Bandra','', 3456542578),
(200003, 'Home Chef', 'Dadar','', 8456784567),
(200004, 'Swad Amristsar', 'Juhu','', 9476594765),
(200005, 'World of Vegan', 'Nariman Point','', 4567845678),
(200006, 'Bombay Canteen', 'Lower Parel','', 9080706050);

INSERT INTO cust_addr (
    cust_addr_id,
    cust_id,
    cust_flat_num,
    cust_floor_num,
    cust_wing,
    cust_bldg_name,
    cust_society_name,
    cust_street_name,
    cust_area,
    cust_city,
    cust_state,
    cust_pin_code
) VALUES
(150001, 100001, 4509, 45, 'A', 'Blue Heights', 'Blue Heights', 'Worli Seaface Rd', 'Worli', 'Mumbai', 'Maharashtra', 400024),
(150002, 100002, 4518, 45, 'B', 'Blue Heights', 'Blue Heights', 'Worli Seaface Rd', 'Worli', 'Mumbai', 'Maharashtra', 400024),
(150003, 100003, 4206, 42, 'C', 'Blue Heights', 'Blue Heights', 'Worli Seaface Rd', 'Worli', 'Mumbai', 'Maharashtra', 400024),
(150004, 100004, 147, 1, NULL, 'Tendulkar Villa', NULL, 'Jogger''s Park Rd', 'Bandra', 'Mumbai', 'Maharashtra', 400030),
(150005, 100005, 3109, 31, 'D', 'Seventh Heaven', 'Paradise Society', 'Madh Island Rd', 'Juhu', 'Mumbai', 'Maharashtra', 400054),
(150006, 100006, 3505, 35, 'E', 'Seventh Heaven', 'Paradise Society', 'Madh Island Rd', 'Juhu', 'Mumbai', 'Maharashtra', 400054),
(150007, 100007, 5604, 56, 'F', '8 PM Bldg', 'King''s World Society', 'Stock Exchange Rd', 'Nariman Point', 'Mumbai', 'Maharashtra', 400032),
(150008, 100008, 235, 1, NULL, 'Patil Villa', NULL, 'S.Keer Rd', 'Dadar', 'Mumbai', 'Maharashtra', 400028),
(150009, 100009, 1304, 13, 'A', 'Matoshree Ankur', NULL, 'Ganesh Peth Rd', 'Dadar', 'Mumbai', 'Maharashtra', 400028),
(150010, 100010, 2507, 25, 'B', 'Kohinoor Square', 'Kohinoor Square Residential Society', 'N.C.Kelkar Rd', 'Dadar', 'Mumbai', 'Maharashtra', 400028);

INSERT INTO rest_addr (rest_addr_id, rest_id, rest_shop_no, rest_street_name, rest_floor_num, rest_area, rest_city, rest_state, rest_pin_code) VALUES
(170001, 200001, 12, '1st Cross Rd', 1, 'Worli', 'Mumbai', 'Maharashtra', 400024),
(170002, 200002, 18, '16th Pali Hill Rd', 2, 'Bandra', 'Mumbai', 'Maharashtra', 400030),
(170003, 200003, 25, 'Shivaji Park Rd', 1, 'Dadar', 'Mumbai', 'Maharashtra', 400028),
(170004, 200004, 30, '100 Ft Rd', 1, 'Juhu', 'Mumbai', 'Maharashtra', 400054),
(170005, 200005, 5, 'Air India Office Rd', 2, 'Nariman Point', 'Mumbai', 'Maharashtra', 400032),
(170006, 200006, 15, 'Pheonix Market City', 2, 'Lower Parel', 'Mumbai', 'Maharashtra', 400076);

INSERT INTO cust_food_order (cf_order_id, rest_id, cust_id, cust_Phone_No, cust_addr_id, cf_order_date, item_price_map, cf_order_amount, cf_order_status, cf_order_delivery_location)
VALUES (2001, 200001, 100001, 9876543210, 150001, TIMESTAMP '2025-07-22 12:30:00',
' "Greek Salad": 180.50, : 1,
  "Kale Caesar Salad": 195.00, : 1,
  "Hummus & Veggies": 110.00, : 1',
    485.5, 'PLACED', '4th Floor Block B Tech Park Bengaluru');
    
INSERT INTO payment
(payment_id, cust_id, cf_order_id, rest_id, payment_total_amount, payment_mode, payment_status)
VALUES
(1001, 100001, 2001, 200001, 300.0, 'UPI', 'Completed');

INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1001, 'Greek Salad', 180.50, 200001);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1002, 'Quinoa Bowl', 220.00, 200001);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1003, 'Grilled Salmon', 450.00, 200001);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1004, 'Avocado Toast', 160.25, 200001);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1005, 'Veggie Wrap', 140.00, 200001);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1006, 'Kale Caesar Salad', 195.00, 200001);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1007, 'Zucchini Noodles', 210.75, 200001);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1008, 'Chicken Cobb Salad', 230.00, 200001);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1009, 'Tuna Poke Bowl', 320.00, 200001);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1010, 'Hummus & Veggies', 110.00, 200001);

INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1011, 'Lentil Soup', 130.50, 200002);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1012, 'Turkey Lettuce Wraps', 175.00, 200002);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1013, 'Buddha Bowl', 200.00, 200002);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1014, 'Roasted Beet Salad', 190.75, 200002);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1015, 'Grilled Shrimp Skewers', 340.00, 200002);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1016, 'Spinach & Feta Omelette', 160.00, 200002);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1017, 'Cauliflower Rice Bowl', 180.50, 200002);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1018, 'Mediterranean Platter', 250.00, 200002);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1019, 'Smoked Salmon Bagel', 275.25, 200002);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1020, 'Chickpea Salad', 155.00, 200002);

INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1021, 'Power Green Smoothie', 120.00, 200003);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1022, 'Grilled Chicken Breast', 290.00, 200003);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1023, 'Couscous Salad', 170.00, 200003);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1024, 'Asparagus Tart', 210.50, 200003);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1025, 'Stuffed Bell Peppers', 190.00, 200003);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1026, 'Broccoli & Cheddar Frittata', 160.00, 200003);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1027, 'Sesame Seared Tuna', 370.00, 200003);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1028, 'Lemon Herb Quinoa', 150.00, 200003);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1029, 'Apple Walnut Salad', 180.75, 200003);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1030, 'Black Bean Burger', 200.00, 200003);

INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1031, 'Tofu Stir Fry', 195.00, 200004);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1032, 'Roasted Veggie Bowl', 185.00, 200004);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1033, 'Egg White Scramble', 140.00, 200004);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1034, 'Berry Yogurt Parfait', 125.00, 200004);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1035, 'Arugula Salad', 155.00, 200004);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1036, 'Grilled Portobello Mushrooms', 220.00, 200004);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1037, 'Seared Halibut', 400.00, 200004);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1038, 'Lime Cilantro Chickpeas', 145.00, 200004);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1039, 'Farro Salad', 175.00, 200004);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1040, 'Soba Noodle Bowl', 210.00, 200004);

INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1041, 'Pumpkin Soup', 135.00, 200005);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1042, 'Grilled Zucchini Boats', 165.00, 200005);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1043, 'Quinoa Stuffed Mushrooms', 190.00, 200005);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1044, 'Cranberry Kale Salad', 170.00, 200005);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1045, 'Grilled Sea Bass', 410.00, 200005);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1046, 'Peach Caprese Salad', 185.00, 200005);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1047, 'Miso Glazed Cod', 380.00, 200005);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1048, 'Ricotta Toast with Berries', 150.00, 200005);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1049, 'Pesto Zoodles', 175.00, 200005);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1050, 'Roasted Carrot Hummus', 140.00, 200005);

INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1051, 'Greek Salad', 180.50, 200006);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1052, 'Quinoa Bowl', 220.00, 200006);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1053, 'Grilled Salmon', 450.00, 200006);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1054, 'Avocado Toast', 160.25, 200006);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1055, 'Veggie Wrap', 140.00, 200006);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1056, 'Kale Caesar Salad', 195.00, 200006);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1057, 'Zucchini Noodles', 210.75, 200006);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1058, 'Chicken Cobb Salad', 230.00, 200006);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1059, 'Tuna Poke Bowl', 320.00, 200006);
INSERT INTO menu (item_id, item_name, item_price, rest_id) VALUES (1060, 'Hummus & Veggies', 110.00, 200006);

UPDATE restaurant 
SET rest_menu = (
    SELECT LISTAGG(item_name, ', ')
    FROM menu
    WHERE rest_id = 200001
)
WHERE rest_id = 200001;

UPDATE restaurant 
SET rest_menu = (
    SELECT LISTAGG(item_name, ', ')
    FROM menu
    WHERE rest_id = 200002
)
WHERE rest_id = 200002;

UPDATE restaurant 
SET rest_menu = (
    SELECT LISTAGG(item_name, ', ')
    FROM menu
    WHERE rest_id = 200003
)
WHERE rest_id = 200003;

UPDATE restaurant 
SET rest_menu = (
    SELECT LISTAGG(item_name, ', ')
    FROM menu
    WHERE rest_id = 200004
)
WHERE rest_id = 200004;

UPDATE restaurant 
SET rest_menu = (
    SELECT LISTAGG(item_name, ', ')
    FROM menu
    WHERE rest_id = 200005
)
WHERE rest_id = 200005;

UPDATE restaurant 
SET rest_menu = (
    SELECT LISTAGG(item_name, ', ')
    FROM menu
    WHERE rest_id = 200006
)
WHERE rest_id = 200006;
