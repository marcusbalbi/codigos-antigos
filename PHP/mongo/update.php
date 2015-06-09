<?php
include 'mongo.php';


if(isset ($_POST['name']))
{    
    $people->update(
            array('_id'=>new MongoId($_POST['id'])),
            array('name'=>$_POST['name'],
                  'job'=>$_POST['job'])
            );
            
    header("Location: index.php");
}
else if(isset($_GET['id']))
{
    $id = $_GET['id'];
    $person = $people->findOne(array('_id'=>new MongoId($id)));
    
}

?>


<form name="people" method="POST">
    <input type="hidden" name="id" value="<?php echo $person['_id']; ?>">
    <p>Name: <input type="text" name="name" value="<?php echo $person['name'] ?>"> </p>
    <p>Job: <input type="text" name="job" value="<?php echo $person['job'] ?>" > </p>
    <button type="submit">ATUALUZAR</button>
</form>