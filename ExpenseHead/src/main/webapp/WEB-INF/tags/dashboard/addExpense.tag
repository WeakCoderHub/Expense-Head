<%@ tag language="java" pageEncoding="ISO-8859-1"%>


<div id="popupForm" class="addExpenseTable">
	<table >
		<tr>
			<td>Amount</td>
			<td><input type="number" name="amount" autofocus="autofocus"  id="expenseAmount" /></td>
			<td>Pool<input type="checkbox" name="pool" id="pool"></td>
		</tr>
		<tr>
			<td>Expense Type</td>
			<td><select name="expenseType" id="expenseTypeId">
					<option value="">Select Type</option>
			</select></td>
			<td></td>
		</tr>
		<tr>
			<td>Description</td>
			<td><input type="text" name="description" class="valign-inputbox" id="description"/></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="3"><button name="submit" value="submit" class="button-secondary pure-button" id="addToDB">Submit</button></td>
		</tr>
	</table>
	
	<input type="hidden" id="forPopupUse" />
</div>