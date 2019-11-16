<?php
/**
 *
 */
class ListController
{

  public function list(){
    // $posts = Home::selanjing();
    // $posta = Kucing::selkucing();
    $posts = lista :: tampil();
    require_once('views/pages/home.php');
  }

  public function addData(){
    $post = lista::addData($_POST["cashier"],$_POST["product"],$_POST["category"],$_POST["price"]);
    // header("location:index.php?controller=form&action=formc");
    // http://localhost/web1/index.php?controller=form&action=formx
  }

}


 ?>
