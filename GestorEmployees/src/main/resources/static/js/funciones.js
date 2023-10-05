function openDeleteDialog(id){
    swal({
      title: "¿Estás seguro?",
      text: "No podrás recuperar al empleado que quieres borrar...",
      icon: "warning",
      buttons: true,
      dangerMode: true,
    }).then((willDelete) => {
      if (willDelete) {
        $.ajax({
          url:"/demo/v1/deleteEmployee/"+id,
          success: function(res){
              console.log(res);
          }
        });
        swal("Poof! Tu empleado ha sido eliminado", {
          icon: "success",
        }).then((ok)=>{
          location.href="/demo/v1/employees"
        });
      } else {
        swal("¡Tus empleados están a salvo! :)");
      }
    });
}