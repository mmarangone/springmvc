<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Administrar Aliens</title>
<style>
	body {
		font-family: Arial, sans-serif;
		background-color: #f0f0f0;
		margin: 0;
		padding: 20px;
	}
	.container {
		max-width: 600px;
		margin: 0 auto;
		background-color: #fff;
		padding: 20px;
		border-radius: 5px;
		box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
	}
	h1 {
		text-align: center;
	}
	h2 {
		margin-top: 20px;
	}
	form {
		margin-top: 10px;
	}
	label {
		font-weight: bold;
	}
	input[type="text"] {
		width: 100%;
		padding: 10px;
		margin: 5px 0;
		border: 1px solid #ccc;
		border-radius: 3px;
	}
	input[type="submit"] {
		background-color: #007bff;
		color: #fff;
		padding: 10px 20px;
		border: none;
		border-radius: 3px;
		cursor: pointer;
	}
	input[type="submit"]:hover {
		background-color: #0056b3;
	}
	hr {
		border: 0;
		border-top: 1px solid #ccc;
		margin-top: 20px;
	}
</style>
</head>
<body>
    <div class="container">
        <h1>Welcome to My Alien Administration Program</h1>
        <h2>Add Alien</h2>
        <form action="addAlien" method="post">
            <label for="aid">Enter ID:</label>
            <input type="text" id="aid" name="aid"><br>
            <label for="aname">Enter Name:</label>
            <input type="text" id="aname" name="aname"><br> 
            <input type="submit" value="Add Alien">
        </form>
        <hr>
        <h2>Get Aliens</h2>
        <form action="getAlienById" method="get">
            <label for="getById">Get Alien by ID:</label>
            <input type="text" id="getById" name="aid"><br> 
            <input type="submit" value="Search">
        </form>
        <form action="getAlienByName" method="get">
            <label for="getByName">Get Alien by Name:</label>
            <input type="text" id="getByName" name="aname"><br> 
            <input type="submit" value="Search">
        </form>
        <hr>
        <h2>Delete Alien</h2>
        <form action="deleteAlien" method="post">
            <label for="deleteById">Delete Alien by ID:</label>
            <input type="text" id="deleteById" name="aid"><br> 
            <input type="submit" value="Delete">
        </form>
    </div>
</body>
</html>