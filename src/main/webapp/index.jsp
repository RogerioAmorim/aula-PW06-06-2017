<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Calculo IMC</title>
    <!-- Bootstrap -->
    <!--link href="css/bootstrap.min.css" rel="stylesheet"-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <style type="text/css">
       h1{
        text-align: center;
       }
    </style>

  
  </head>
<body>
  <h1>Calculo de IMC</h1>
    <div class="text-center">
      <form class="navbar-form navbar-center" action="calculo-imc"> 
        <div class="row">
          <span class="label label-default" style=" font-size: 19px">Altura</span>
            <div class="input-group">
              <input type="text" class="form-control" placeholder="Altura" aria-describedby="basic-addon1" name="altura">
                <span class="input-group-addon" id="basic-addon1">m</span>
            </div>
        </div>
    
        <br/>
    
        <div class="row">
          <span class="label label-default" style=" font-size: 19px">Peso</span>
            <div class="input-group">
              <input type="text" class="form-control" placeholder="Peso" aria-describedby="basic-addon1" name="peso">
                <span class="input-group-addon" id="basic-addon1">kg</span>
            </div>
        </div>

        <br/>

      <div class="row" style="text-align: center;">
       <span class="label label-default" style=" font-size: 19px">Sexo</span>
        <div class="input-group">
          <select class="form-control" name ="sexo">
            <option >Feminino</option>
            <option>Masculino</option>
          </select> 
        </div>
      </div>
    <br>
    <button type="submit" class="btn btn-primary">CALCULAR</button>
   <br>
   <div class="alert alert-success" role="alert" style="margin-top:45px">${resultado}</div>
   </form>
        </div>
  </body>
</html>