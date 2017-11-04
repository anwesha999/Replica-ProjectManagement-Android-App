<?php 
require "conn.php";
$name = $_GET["name"];
$semester = $_GET["semester"];
$college = $_GET["college"];
$event = $_GET["event"];
$username = $_GET["username"];
$password = $_GET["password"];

$mysql_qry = "insert into employee_data_1 (name,semester,college,event,username,password) values ('$name','$semester','$college','$event','$username','$password')";
$result = mysqli_query($conn ,$mysql_qry);
if($conn->query($mysql_qry) === TRUE) {
echo "Inserted Successfully";
}
else {
echo "error" . $mysql_qry . "<br>" . $conn->error;
}
$conn->close();
?>