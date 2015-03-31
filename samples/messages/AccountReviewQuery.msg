document AccountReviewQuery {

	optional:

	completed_start_date date 				# The date on or after which any returned reviews were completed
	completed_end_date   date    	   		# The date on or before which any returned reviews were completed
	unassigned           boolean (false)	# Whether or not to restrict search results to only unassigned reviews
	current_user		 boolean (false)    # Whether or not to use the current user as the context when matching review assignments
	user_id				 integer 			# The primary key of the user to use as the context when matching review assignments
	limit				 integer			# The maximum number of reviews to return

	account_filters		 map[string]		# A map of filters (operator is implied to be equals(=)) against fields of AccountReview        
	review_filters	   	 map[string]		# A map of filters (operator is implied to be equals(=)) against fields of Account

}