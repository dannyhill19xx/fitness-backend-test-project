INSERT INTO roles(id, name)
VALUES (101, 'ADMIN'),
       (102, 'USER');

INSERT INTO users(id, age, email, first_name, gender, last_name, password, phone,
                                                 username, role_id)
VALUES (103, 18, 'user101test@gmail.com', 'user101test', 'MALE', 'user101test',
        '$2a$12$dcfncSWHeAirIKfVLR855OFiNStej/JS.RZqDz/JwsOmth7cqr5Za', '89999999101', 'user101', 1),
       (104, 19, 'user102test@gmail.com', 'user102test', 'FEMALE', 'user2test',
        '$2a$12$oKyYPTUSdVEH.mccvYPH3ePnQ22J/msCAKOS4fc1/zMVBINq7oKNa', '89999999102', 'user102', 2),
       (105, 20, 'user103test@gmail.com', 'user103test', 'MALE', 'user103test',
        '$2a$12$oKyYPTUSdVEH.mccvYPH3ePnQ22J/msCAKOS4fc1/zMVBINq7oKNa', '89999999103', 'user103', 2),
       (106, 21, 'user104test@gmail.com', 'user104test', 'FEMALE', 'user104test',
        '$2a$12$oKyYPTUSdVEH.mccvYPH3ePnQ22J/msCAKOS4fc1/zMVBINq7oKNa', '89999999104', 'user104', 2);