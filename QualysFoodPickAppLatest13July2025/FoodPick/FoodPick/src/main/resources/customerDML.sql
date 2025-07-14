INSERT INTO customer (cust_id, cust_Name, cust_Addr, cust_Phone_No) VALUES 
(100001, 'Virat Kohli', 'Worli Mumbai 400024',6578965789),
(100002, 'Rohit Sharma', 'Worli Mumbai 400024',7865478654),
(100003, 'Shreyas Iyer', 'Worli Mumbai 400024',5467154671),
(100004, 'Arjun Tendulkar', 'Bandra Mumbai 400030',9432694326),
(100005, 'Sunil Gavaskar', 'Juhu Mumbai 400054',6785467854),
(100006, 'Dilip Vengsarkar', 'Lower Parel Mumbai 400076',4897648976),
(100007, 'Ravi Shastri', 'Nariman Point Mumbai 400032',8546785467),
(100008, 'Sandeep Patil', 'Dadar Mumbai 400028',9345693456),
(100009, 'Pravin Amre', 'Dadar Mumbai 400028',8342183421),
(100010, 'Ajinkya Rahane', 'Dadar Mumbai 400028',9346793467);


INSERT INTO restaurant (rest_id, rest_name, rest_location, rest_category, rest_menu, rest_phone_no) VALUES 
(200001, 'One 8', 'Worli Mumbai 400024','Multi-Cuisine','Veg, Vegan', 1234512345),
(200002, 'Vegan Bistro', 'Bandra Mumbai 400030','Asian','Veg, Non-Veg', 3456542578),
(200003, 'Home Chef', 'Dadar Mumbai 400028','Indian','Veg, Non-Veg', 8456784567),
(200004, 'Swad Amristsar', 'Juhu Mumbai 400054','Indian','Veg, Non-Veg', 9476594765),
(200005, 'World of Vegan', 'Nariman Point Mumbai 400032','American','Vegan', 4567845678),
(200006, 'Bombay Canteen', 'Lower Parel Mumbai 400076','Indian','Veg, Non-Veg', 9080706050);

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

INSERT INTO cust_food_order
(cf_order_id, rest_id, cust_id, cust_Phone_No, cust_addr_id, cf_order_date, cf_order_items, cf_price_items, cf_order_quantity, cf_order_amount, cf_order_status)
VALUES
(2001, 200001, 100001, 9876543210, 150001, CURRENT_TIMESTAMP, 'Burger, Fries', 150.0, 2, 300.0, 'Placed'),
(2002, 200002, 100002, 8765432109, 150002, CURRENT_TIMESTAMP, 'Pizza, Coke', 250.0, 1, 250.0, 'Completed'),
(2003, 200003, 100003, 7654321098, 150003, CURRENT_TIMESTAMP, 'Pasta, Salad', 180.0, 3, 540.0, 'Pending'),
(2004, 200004, 100004, 6543210987, 150004, CURRENT_TIMESTAMP, 'Samosa', 50.0, 5, 250.0, 'Completed'),
(2005, 200006, 100007, 8546785467, 150007, CURRENT_TIMESTAMP, 'Sushi', 400.0, 2, 800.0, 'Completed');

INSERT INTO payment
(payment_id, cust_id, cf_order_id, rest_id, payment_total_amount, payment_mode, payment_status)
VALUES
(1001, 100001, 2001, 200001, 300.0, 'UPI', 'Completed'),
(1002, 100002, 2002, 200002, 250.0, 'Cash', 'Completed'),
(1003, 100003, 2003, 200003, 540.0, 'Debit Card', 'Pending'),
(1004, 100004, 2004, 200004, 250.0, 'Net Banking', 'Completed'),
(1005, 100005, 2005, 200005, 550.75, 'Credit Card', 'Completed');


INSERT INTO menu (menu_id, rest_id, menu_items, menu_item_price)VALUES
(100100, 200001, 'Ceaser Salad, Mushroom Dimsums', 1200.00),
(100101, 200002, 'Gold Plated Avocado, Tempura', 2500.00),
(100102, 200003, 'Quadranntino E Plefis', 1800.00),
(100103, 200004, 'Grilled Sandwich', 900.00),
(100104, 200005, 'Turkey Wings', 2200.00),
(100105, 200006, 'King Size Crabs', 4000.00);