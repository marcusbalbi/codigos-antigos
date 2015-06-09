<?php

$m = new Mongo();

$db = $m->selectDB('learningdb');

$people = $db->createCollection('people');