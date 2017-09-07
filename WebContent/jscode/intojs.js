/**
 * 输入验证
 */
function frominto(){
	var intouname = doucment.getElementById("username").value;
	var intomobile = doucment.getElementById("mobile").value;
	var intostartdate = document.getElementById("d422").value;
	var intoedate = document.getElementById("d4312").value;
	var intoremarks = doucument.getElementById("remarks").value;
	var str = intouname+intomobile+intostartdate+intoedate+intoremarks;
	alert(str);
}