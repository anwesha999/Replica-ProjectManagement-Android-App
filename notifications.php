<?php 
require "conn.php";
$mysql_qry = "SELECT * FROM `employee_data_2";
$result = mysqli_query($conn ,$mysql_qry);

while($person=mysqli_fetch_assoc($result)){
	echo "Notification At One Glance:";echo "\n\n";
	echo "Project Name: ".$person['Project_Name'];
	echo "\n\n";
	echo "Description of project: ".$person['Desc_of_project'];
		echo "\n\n";
	echo "Assigned to: ".$person['Assigned_to'];
	echo "\n\n";
	echo "Phone No: ".$person['phone_no'];
		echo "\n\n";
	echo "Email Id: ".$person['email_id'];
		echo "\n\n";
	echo "Date Due Of The Project: ".$person['date_due_of_the_project'];
		echo "\n\n";
	echo "Duration Of The Project: ".$person['duration_of_the_project'];
		echo "\n\n";
	echo "Phase Of Project: ".$person['phase'];
		echo "\n\n";
    echo "Working Phase: ".$person['spinner4'];
		echo "\n\n";
	echo "Relevance Of Project: ".$person['spinner5'];
		echo "\n\n";
	echo "Stay Motivated!!!";
	}
$conn->close();
?>