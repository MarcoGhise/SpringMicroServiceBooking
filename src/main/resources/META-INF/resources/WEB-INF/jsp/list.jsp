<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Booking List</title>

</head>
<body bgcolor="#ffda95">

	<table cellpadding="0" cellspacing="2" width="800"
		style="font-family: Verdana, Geneva, sans-serif; font-size: 12px; background-color: #ffda95;">
		<tr>
			<td colspan="2"><h2>Booking List</h2></td>
		</tr>
		<c:forEach var="booking" items="${bookings}">			
			<tr>
				<td
					style="background-color: #fe9901; color: #FFF; height: 20px; border: 1px solid #666; padding: 0 5px 0 10px;">Code</td>
				<td
					style="background-color: #fff; height: 20px; border: 1px solid #333; padding: 0 5px 0 10px;">${booking.code}</td>
			</tr>
			<tr>
				<td
					style="background-color: #fe9901; color: #FFF; height: 20px; border: 1px solid #666; padding: 0 5px 0 10px;">Flight Number</td>
				<td
					style="background-color: #fff; height: 20px; border: 1px solid #333; padding: 0 5px 0 10px;">${booking.flightNumber}</td>
			</tr>
			<tr>
				<td
					style="background-color: #fe9901; color: #FFF; height: 20px; border: 1px solid #666; padding: 0 5px 0 10px;">Name</td>
				<td
					style="background-color: #fff; height: 20px; border: 1px solid #333; padding: 0 5px 0 10px;">${booking.name}</td>
			</tr>
			<tr>
				<td
					style="background-color: #fe9901; color: #FFF; height: 20px; border: 1px solid #666; padding: 0 5px 0 10px;">Surname</td>
				<td
					style="background-color: #fff; height: 20px; border: 1px solid #333; padding: 0 5px 0 10px;">${booking.surname}</td>
			</tr>
			<tr>
				<td
					style="background-color: #fe9901; color: #FFF; height: 20px; border: 1px solid #666; padding: 0 5px 0 10px;">Seat</td>
				<td
					style="background-color: #fff; height: 20px; border: 1px solid #333; padding: 0 5px 0 10px;">${booking.seat}</td>
			</tr>
						<tr>
				<td style="background-color: #c67701; color: #FFF; height: 20px; border: 1px solid #666; padding: 0 5px 0 10px;" colspan="2">&nbsp;</td></tr>
						
		</c:forEach>

	</table>

</body>
</html>
