# GG Foosball Analytics Tracker

This is the greatest spectacle in foosball for companies smaller than 60 employees, in Indianapolis, making enterprise software, with multiple Davids.

###3 Types of API calls:

####get call on localhost/users/
	Returns all of the users in order by their ranking in json format.

####post call on localhost/user/?name=Chuck Dishmon&nickname=The DishMON
	Adds a user to the database. Name and nickname are specified, rating default is 500, wins and losses both set to 0.
	Returns a json representation of the user who you just created. Will send a bad status if the user was unable to be created.

####post call on localhost/users/game/?id1=Jeff Hertzler&id2=Rob Adams&id3=Chuck Dishmon&id4=Chuck Dishmon
	Updates the scores and wins/losses of the users. id1 and id2 are the winners, id3 and id4 are the losers.
	Returns a json acknowledged.
