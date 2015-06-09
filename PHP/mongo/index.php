<?php
ini_set('display_error', true);
include './mongo.php';

if(isset($_POST['name']))
{
    $people->insert(array(
        'name'=>$_POST['name'],
        'job'=>$_POST['job']
    ));
    
}
try
{
$cursor = $people->find();
$cursor->sort(array('name'=>-1));
}
catch(Exception $e)
{
    var_dump($e->getMessage());
}

?>
<form name="people" method="POST">
    <p>Name: <input type="text" name="name"> </p>
    <p>Job: <input type="text" name="job"> </p>
    <button type="submit">CRIAR</button>
</form>

<?php if(($cursor->count() > 0)) : ?>
<ul>
    <?php foreach ($cursor as $item) : ?>
    <li>
        <h2><?php echo $item['name']; ?>(<?php echo $item['job'] ?>)</h2>
        <p>
            <a href="update.php?id=<?php echo $item['_id']; ?>">Update</a>
            <a href="delete.php?id=<?php echo $item['_id']; ?>">delete</a>
        </p>
    </li>
    <?php endforeach; ?>
</ul>
<?php else : ?>
<p>No People</p>
<?php endif; ?>

