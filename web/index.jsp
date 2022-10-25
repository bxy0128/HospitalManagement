<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<input type="button" id="btn" value="获取数据"/>
<table width="80%" align="center">
  <tr>
    <td>姓名</td>
    <td>年龄</td>
    <td>性别</td>
  </tr>
  <tbody id="content">
  </tbody>
</table>

<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
<script>

  $(function () {
    $("#btn").click(function () {
      <%--
      url:${pageContext.request.contextPath}/a2
      data:可以省略，此案例不用传送数据，只需后台返回数据，故省略不写
      success:function(data)，Ajax请求成功后台返回集合数据，并将数据以标签的形式插入到表格中
      --%>
      $.get("/a2",function (data) {
        console.log(data)
        var html="";
        for (var i = 0; i <data.length ; i++) {
          html+= "<tr>" +
                  "<td>" + data[i].patient_name + "</td>" +
                  "<td>" + data[i].patient_gender + "</td>" +
                  "<td>" + data[i].patient_date_start + "</td>" +","
                  "<td>" + data[i].patient_patient_dept + "</td>" +","
                  "<td>" + data[i].patient_state + "</td>" +","
                  "<td>" + data[i].patient_doc + "</td>" +","
                  "<td>" + data[i].patient_room + "</td>" +","



          "</tr>"
        }
        $("#content").html(html);
      });
    })
  })
</script>
</body>
</html>
