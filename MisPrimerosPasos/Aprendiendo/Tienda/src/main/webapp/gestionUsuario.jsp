<%@ page import="mx.edu.utez.pruebaf.dao.UserDao"%>
<%@ page import="mx.edu.utez.pruebaf.model.User"%>
<%@ page import="java.util.ArrayList"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestión de Usuarios</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/datatables.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/styles.css">
</head>
<body>

<div class="container-xl">
    <h1 class="text-center">Gestión de Usuarios</h1>

    <table id="example" class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Correo</th>
            <th>Puesto</th>
            <th>Admin</th>
            <th>Estatus</th>
            <th>Acciones</th>
        </tr>
        </thead>
        <tbody>
        <%
            UserDao userDao = new UserDao();
            ArrayList<User> users = (ArrayList<User>) userDao.getAll();
            for (User user : users) {
        %>
        <tr>
            <td><%= user.getId() %></td>
            <td><%= user.getNombre() %></td>
            <td><%= user.getApellido() %></td>
            <td><%= user.getCorreo() %></td>
            <td><%= user.getPuesto() %></td>
            <td><%= user.isEsAdmin() ? "Sí" : "No" %></td>
            <td><%= user.isEstatus() ? "Activo" : "Inactivo" %></td>
            <td>
                <button class="btn btn-primary" onclick="mostrarModal(<%= user.getId() %>)">Editar</button>
                <button class="btn btn-warning" onclick="cambiarEstatus(<%= user.getId() %>, <%= !user.isEstatus() %>)">
                    <%= user.isEstatus() ? "Inhabilitar" : "Habilitar" %>
                </button>
            </td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>

<!-- Modal de actualización -->
<div class="modal fade" id="actualizarModal" tabindex="-1" aria-labelledby="actualizarModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="actualizarModalLabel">Actualizar Usuario</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form id="actualizarForm">
                    <input type="hidden" id="userId">
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombre</label>
                        <input type="text" class="form-control" id="nombre">
                    </div>
                    <div class="mb-3">
                        <label for="apellido" class="form-label">Apellido</label>
                        <input type="text" class="form-control" id="apellido">
                    </div>
                    <div class="mb-3">
                        <label for="correo" class="form-label">Correo</label>
                        <input type="email" class="form-control" id="correo">
                    </div>
                    <div class="mb-3">
                        <label for="puesto" class="form-label">Puesto</label>
                        <input type="text" class="form-control" id="puesto">
                    </div>
                    <div class="mb-3">
                        <label for="esAdmin" class="form-label">¿Es administrador?</label>
                        <select class="form-select" id="esAdmin">
                            <option value="true">Sí</option>
                            <option value="false">No</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="rfc" class="form-label">RFC</label>
                        <input type="text" class="form-control" id="rfc">
                    </div>
                    <div class="mb-3">
                        <label for="estatus" class="form-label">Estatus</label>
                        <select class="form-select" id="estatus">
                            <option value="true">Activo</option>
                            <option value="false">Inactivo</option>
                        </select>
                    </div>
                    <button type="button" class="btn btn-primary" onclick="actualizarUsuario()">Guardar cambios</button>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/JS/jquery.js"></script>
<script src="${pageContext.request.contextPath}/JS/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/JS/datatables.js"></script>
<script src="${pageContext.request.contextPath}/JS/scripts.js"></script>

<script>
    function mostrarModal(id) {
        // Hacer una solicitud AJAX para obtener los datos del usuario por ID y rellenar el formulario
        $.get('ObtenerUsuarioServlet', {id: id}, function (data) {
            $('#userId').val(data.id);
            $('#nombre').val(data.nombre);
            $('#apellido').val(data.apellido);
            $('#correo').val(data.correo);
            $('#puesto').val(data.puesto);
            $('#esAdmin').val(data.esAdmin);
            $('#rfc').val(data.rfc);
            $('#estatus').val(data.estatus);
            $('#actualizarModal').modal('show');
        });
    }

    function actualizarUsuario() {
        var id = $('#userId').val();
        var nombre = $('#nombre').val();
        var apellido = $('#apellido').val();
        var correo = $('#correo').val();
        var puesto = $('#puesto').val();
        var esAdmin = $('#esAdmin').val();
        var rfc = $('#rfc').val();
        var estatus = $('#estatus').val();

        $.post('ActualizarUsuarioServlet', {
            id: id,
            nombre: nombre,
            apellido: apellido,
            correo: correo,
            puesto: puesto,
            esAdmin: esAdmin,
            rfc: rfc,
            estatus: estatus
        }, function () {
            $('#actualizarModal').modal('hide');
            location.reload();
        });
    }

    function cambiarEstatus(id, nuevoEstatus) {
        $.post('CambiarEstatusServlet', {id: id, estatus: nuevoEstatus}, function () {
            location.reload();
        });
    }
</script>

</body>
</html>
