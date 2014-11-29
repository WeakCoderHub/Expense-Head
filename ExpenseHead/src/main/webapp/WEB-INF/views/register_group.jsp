
<body>
	<form>
		<table align="center" width="30%" style="margin-top: 2em;"
			cellpadding="5">
			<tr>
				<td style="text-align: left;"><label class="text-label"
					for="groupname">Group Name</label></td>
				<td><input type="text" class="large-input-box" id="groupname"
					placeholder="Enter Group Name"></td>
			</tr>
			<tr>
				<td style="text-align: left;"><label class="text-label"
					for="groupname">Address</label></td>
				<td><input type="text" class="large-input-box" id="address"
					placeholder="Enter Address"></td>
			</tr>
		</table>
		<table  align="center" width="50%" style="margin-top: 2em;">



			<tr>
				<td>
					<div id="addMembersDetails">

						<table id="membersTable" align="center">

							<tbody id="memberDetailBody">
								<tr>
									<td>1.</td>
									<td><input type="text" class="input-box" id="memberName1"
										placeholder="Enter Name"></td>
									<td><input type="text" class="input-box"
										id="memberEmailId1" placeholder="Enter Email ID"></td>
									<td><input type="text" class="input-box" id="contactNo1"
										placeholder="Enter Contact No."></td>
									<td><input type="radio" class="css-checkbox" id="radio1"
										name="isAdmin" checked="checked"> <label for="radio1"
										class="css-label"></label></td>
									<td><a href="#" onclick="deleteRow(this)">
											<div class="minus-sign"></div>
									</a></td>
								</tr>

								<tr>
									<td>2.</td>
									<td><input type="text" class="input-box" id="memberName2"
										placeholder="Enter Name"></td>
									<td><input type="text" class="input-box"
										id="memberEmailId2" placeholder="Enter Email ID"></td>
									<td><input type="text" class="input-box" id="contactNo2"
										placeholder="Enter Contact No."></td>

									<td><input type="radio" class="css-checkbox" id="radio2"
										name="isAdmin" > <label for="radio2"
										class="css-label"></label></td>

									<td><a href="#" onclick="deleteRow(this)">
											<div class="minus-sign"></div>
									</a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</td>
			</tr>

			<tr>
				<td>
					<div style="margin-right: 90px; float: right;">
						<button type="button" class="register-button"
							style="width: 200px; height: 35px;" id="addMember">Add
							Members</button>
					</div>
				</td>
			</tr>
			<tr>
				<td><br>
				<br>
					<button id="createMyGroup" type="button" class="register-button"
						style="width: 40%; height: 50px;">Create My Group</button></td>
			</tr>

		</table>
	</form>

</body>
<script src="../js/register.js"></script>
