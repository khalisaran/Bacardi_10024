/**
 *
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p>
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC </br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/


USE bacardi;

CREATE TABLE Bacardi(
id bigint(19) NOT NULL auto_increment,
created_date datetime NOT NULL DEFAULT NOW(),
created_by bigint(19) NOT NULL DEFAULT 0,
updated_date datetime NOT NULL DEFAULT NOW(),
updated_by bigint(19) NOT NULL DEFAULT 0,
price bigint(19),
quantity bigint(19),
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

