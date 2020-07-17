-- create database departmentdepartment
DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE TestingSystem;
USE TestingSystem;


-- create table: Department
DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	DepartmentID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TotalMember				TINYINT	UNSIGNED,
    DepartmentName 			NVARCHAR(30) NOT NULL UNIQUE KEY
);

-- create table: Role
DROP TABLE IF EXISTS `Role`;
CREATE TABLE `Role` (
    RoleID 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    RoleName NVARCHAR(30) NOT NULL UNIQUE KEY
);

-- create table: Member
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User`(
	UserID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    UserName 				NVARCHAR(100) NOT NULL ,
	Email 					NVARCHAR(100) NOT NULL UNIQUE KEY,
    `Password` 				NVARCHAR(100) NOT NULL ,
    RoleID					TINYINT UNSIGNED,
    DepartmentID			TINYINT UNSIGNED,
	FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY (RoleID) REFERENCES `Role`(RoleID)
    
);


-- Add data Department
INSERT INTO Department(DepartmentName, TotalMember) 
VALUES
						(N'Marketing'	, 1),
						(N'Sale'		, 2),
						(N'Bảo vệ'		, 3),
						(N'Nhân sự'		, 4),
						(N'Kỹ thuật'	, 5),
						(N'Tài chính'	, 6),
						(N'Phó giám đốc', 7),
						(N'Giám đốc'	, 8),
						(N'Thư kí'		, 9),
						(N'Bán hàng'	, 10);
                        
                        
INSERT INTO `Role`(`RoleName`) 
VALUES  			("Admin"),
					("USER");

INSERT INTO `User`(UserName, 				Email,								`Password` 		,RoleID		)
VALUES				('Admin1',					"admin123@gmail.com",				"12345"    		,1		),
					('Admin2',					"admin2223@gmail.com",				"12345"    		,1		);
                    
                    
INSERT INTO `User`(UserName, 				DepartmentID,			Email,					`Password`	,RoleID			) 
VALUES				('Nguyễn Hoàng Nam',		1,						"user1@gmail.com",		"12345"		,2				),
					('Nguyễn Hoàng Tuấn',		8,						"user2@gmail.com",		"12345"		,2			),
					('Nguyễn Quỳnh Mai',		3,						"user3@gmail.com",		"12345"		,2			),
					('Vũ Văn  Toàn',			4,						"user4@gmail.com",		"12345"		,2			),
					('Vũ Hoàng Nam',			7,						"user5@gmail.com",		"12345"		,2			),
					('Nguyễn Thị Hường',		4,						"user6@gmail.com",		"12345"		,2			),
					('Nguyễn Hoàng Hà',			2,						"user7@gmail.com",		"12345"		,2			);
                    





