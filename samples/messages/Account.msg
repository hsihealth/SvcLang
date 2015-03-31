document Account {

	# A representation of a patient account, the context for each account review

	units:

	dollars -> number

	required:

	account_key          integer    # The primary key of the account as maintained by the data warehouse
	account_call_number  string 	# The business identifier of the account, as maintained by the billing system
	current_balance 	 dollars    # The current account balance currently reported by the data warehouse
	date_of_service 	 date       # The date the medical service being billed for occurred 
	division 			 Division   # The division this account has been assigned to 
	provider 			 Provider   # The medical provided that performed the transport 

	optional:

	account_state	     AccountState # The state of this accound as defined by the data warehouse
	rpm_source_key 		 string  	  # The primary key of the account as defined by RPM Online

	level_of_care 		 string
	--
	The level of care associated with the transport

		In general levels of care should be one of:
			* BLS
			* ALS-1
			* ALS-2
			* CCT
	--

	unit_name 						string            # The name of the unit that transported the patient
	base_name 						string            # The name of the base that transported the patient
	age_from_dos 					AgingCategory     # The age of the account from the date of service
	age_from_first_submission 		AgingCategory     # The age of the account from the first submission
	patient_origin_location 		Location          # Where the patient was picked up for transport
	patient_destination_location	Location     	  # Where the patient was transport to
	was_autocrossed_to_sins			boolean (false)   # Whether or not the account was automatically crossed over to a secondary payer
	was_electronic_submission 		boolean (false)	  # Whether or not the claim was submitted electronically
	is_primary_aca_plan 			boolean (false)   # Whether the insurance plan associated with the primary payer is an ACA exchange plan
	primary_aca_plan 				string            # If an ACA plan, the medal color (bronze, gold, etc)

	rpm_status_category 			string            # The status category for this account as defined by RPM Online
	rpm_status 						string			  # The status of this account in RPM Online

	billing_system_schedule 		string			  # The current schedule of this account in the billing system
	billing_system_event 			string            # The current event for this account in the billing system

	primary_payer					Payer 			  # The primary entity responsible for payment of this account
	current_payer					Payer 			  # The entity currently being billed for the remaining balance on the accoumt

	total_charges					dollars (0.0)	  # The total charges applied to this account
	collectible_charges				dollars (0.0)	  # Also known as 'allowable amount', the total charges less any contractual write offs
	total_payments					dollars (0.0)	  # The sum of any payments applied to this account so far
	primary_payment_amount			dollars (0.0)	  # The total payments paid by the primary payer
	supplemental_payment_amount	    dollars (0.0)	  # The total payments paid by any supplemental (non patient) payers
	patient_payment_amount			dollars (0.0)	  # The total payments paid by the patient
	total_refunds					dollars (0.0)	  # The total amount of refunds applied to the account

	first_submission_date			date 			  # The date the first claim was submitted for this account
	last_submission_date			date 			  # The date of the most revcent claim submission for this account
	last_rpm_view_date				date  			  # The last time this account was viewed in RPM
	last_rpm_action_date		    date              # The date the last action was taken on this account in RPM

}	