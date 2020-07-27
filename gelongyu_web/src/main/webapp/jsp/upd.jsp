<%--
  Created by IntelliJ IDEA.
  User: 龙少
  Date: 2020/7/27
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
    <link href="${pageContext.request.contextPath}/css/index_work.css" rel="stylesheet">
</head>
<body>
    <form action="add" method="post">
        会议编号<input type="text" name="code" value=""><br>
        会议名称<input type="text" name="name"><br>
        会议日期<input type="Date" name="start_time">
            至<input type="Date" name="end_time">
        <br>
        会议地址<select name="id" id="d">
                    <option value="">请选择</option>
                </select><br>
        <input type="submit" value="保存">
    </form>
</body>

    <script type="text/javascript">

        $.ajax({
            url:"bianyi",
            dataType:"json",
            type:"post",
            data:{"id":id},
            success:function (obj) {
                for (var i in obj){

                      $("#d").append("<option value="+obj[i].id+">"+obj[i].name+"</option>");
                }

            }



        })



    </script>
</html>
