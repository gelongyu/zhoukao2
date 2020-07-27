<%--
  Created by IntelliJ IDEA.
  User: 龙少
  Date: 2020/7/27
  Time: 9:26
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
    <form action="/list" method="post">
        <input type="hidden" name="cpage">

    </form>
    <table>
        <tr>
            <td>序号</td>
            <td>会议编号</td>
            <td>会议名称</td>
            <td>开始时间</td>
            <td>结束时间</td>
            <td>会议类型</td>
            <td>创建时间</td>
        </tr>
        <c:forEach items="${list}" var="s">
            <tr>
                <td>${s.id}</td>
                <td>${s.code}</td>
                <td>${s.name}</td>
                <td>${s.start_time}</td>
                <td>${s.end_time}</td>
                <td>${s.mname}</td>
                <td>${s.create_time}</td>
                <td>

                <a href="toupd?id=${s.id}">

                    <input type="button" value="编辑">
                </a>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="11">
                <input type="button" value="首页" onclick="fenye(1)">
                <input type="button" value="上一页" onclick="fenye(${cpage == 1 ? 1 : cpage - 1})">
                <c:forEach items="${pa.navigatepageNums}" var="index">
                    <input type="button" value="${index}" onclick="fenye(${index})">
                </c:forEach>
                <input type="button" value="下一页" onclick="fenye(${cpage == pa.getPages() ? pa.getPages() : cpage + 1})">
                <input type="button" value="尾页" onclick="fenye(${pa.getPages()})">
            </td>
        </tr>
    </table>

    <button onclick="tj()" >新增</button>

</body>
<script type="text/javascript">

    function fenye(cpage) {
        $("[name='cpage']").val(cpage);
        $("form").submit();
    }
    function tj() {
        location = "toadd";
    }


</script>
</html>
