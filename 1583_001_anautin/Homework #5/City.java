


// THE CITY OBJECT
class City
{
	

	// DECLARE: instances of Sanctuary 

	private Sanctuary resilience;
	private Sanctuary authenticity;
	private Sanctuary vulnerability;
	private Sanctuary humility;
	private Sanctuary foreverYoung;
	private Sanctuary creativity;
	private Sanctuary imagination;
	private Sanctuary individuality;
	private Sanctuary risk;
	private Sanctuary collaboration;
	private Sanctuary intuition; 





	// CONSTRUCTOR

	public City ()
	{

		// CREATE: memory address for each instance of Sanctuary
		// ASSIGN: memory address to its corresponding reference variable
		// INVOKE: Sanctuary constructor, sending String literals (sanctuary descriptions) for each instance of Sanctuary



		// INVOKE: setter methods, sending 4 Sanctuary references to each instance of Sanctuary
		// these setter methods will assign these 4 references to the north, south, east, and west reference variables


		this.resilience 					= new Sanctuary("... SANCTUARY OF RESILIENCE ...\n\n\n“Obstacles don’t have to stop you. If you run into a wall, \ndon’t turn around and give up. Figure out how to climb it, \ngo through it, or work around it.” - Michael Jordan #23\n\n“You don’t have a right to the cards you believe you should\n have been dealt. You have an obligation to play the hell out of \nthe ones you’re holding.” Cheryl Strayed");	
	
		
		this.authenticity 					= new Sanctuary("... SANCTUARY OF AUTHENTICITY ...\n\n\n“The best part about me is I am not you, I'm me.” - Eminem \n\n\n“Remind yourself: nobody built like you. You designed yourself.” Jay-Z\n\n\n“If the path before you is clear, you’re probably \non someone else’s.” - Carl Jung");

	
		this.vulnerability					= new Sanctuary("... SANCTUARY OF VULNERABILITY ...\n\n\n“If no outer adventure happens to you, then no inner adventure \nhappens to you either.” - Carl Jung\n\n\n“Don’t pick a job with great vacation time. Pick a job that \ndoesn’t need escaping from.”\n\n\n“Adventure may hurt you. But monotony will kill you.”");
		

		this.humility 						= new Sanctuary("... SANCTUARY OF HUMILITY ...\n\n\n“Be humble, for the worst thing in the world is of the same stuff as you; \nbe confident, for the stars are of the same stuff as you.” - Nicholai Velimirovic");
		
		
		this.foreverYoung 					= new Sanctuary("... SANCTUARY FOREVER-YOUNG ...\n\n\n“Every child is an artist. The problem is how to remain an artist \nonce we grow up.” - Pablo Picasso\n\n\n“There is a fountain of youth: it is your mind, your talents, the creativity \nyou bring to your life and the lives of the people you love. \nWhen you learn to tap this source, you will truly have defeated age.” - Sophia Loren\n\n“Don’t you know that it’s worth every treasure on Earth, \nto be young at heart?” - Frank Sinatra");

		
		this.creativity 					= new Sanctuary("... SANCTUARY OF CREATIVITY ...\n\n\n“The creative adult is the child who survived.”\n\n\n“Curiosity about life in all of its \naspects, I think, is still the secret of \ngreat creative people.” - Leo Burnett");

		
		this.imagination 					= new Sanctuary("... SANCTUARY OF IMAGINATION ...\n\n\n“Imagination is more important than knowledge. \nFor knowledge is limited to all we now know and understand, \nwhile imagination embraces the entire world, and \nall there ever will be to know and understand.” - Albert Einstein ");
	

		
		this.individuality 					= new Sanctuary("... SANCTUARY OF INDIVIDUALITY ...\n\n\n“To be normal is the ideal aim of the \nunsuccessful.” - Carl Jung\n\n\n“The one thing that you have that nobody else has is you. \nYour voice, your mind, your story, your vision. \nSo write and draw and build and play and dance and live \nonly as you can.”");
	
		
		this.risk 							= new Sanctuary("... SANCTUARY OF RISK ...\n\n\n“We are born in one day. We die in one day. \nWe can change in one day. And we can fall in love in one day. \nAnything can happen in just one day.”\n\n\n“We must make our experiment. We must make mistakes. \nWe must live out our own vision of life. And there will be error. \nIf you avoid error, you do not live. - Carl Jung ");
	
		
		this.collaboration 					= new Sanctuary("... SANCTUARY OF COLLABORATION ...\n\n\n“You can do what I cannot do. I can do what you cannot do. \nTogether, we can do great things.” - Mother Teresa\n\n\n“If you want to go fast, go alone. \nIf you want to go far, go together.” - African proverb\n\n\n“Those who have learned to collaborate and improvise \nmost effectively have prevailed.” - Charles Darwin");

		
		this.intuition 						= new Sanctuary("... SANCTUARY OF INTUITION ...\n\n\n“The creation of something new is not accomplished by the intellect, \nbut by the play instinct acting from inner necessity. \nThe creative mind plays with the object it loves.” - Carl Jung ");

	


		
		// send Sanctuary references to our direction variables


		this.resilience.					setExits(null, authenticity, vulnerability, null);
		this.authenticity. 					setExits(resilience, null, humility, null);
		this.vulnerability.					setExits(null, humility, null, resilience);
		this.humility.						setExits(vulnerability, null, foreverYoung, authenticity);
		this.foreverYoung.					setExits(null, creativity, imagination, humility);
		this.creativity.					setExits(foreverYoung, null, individuality, null);
		this.imagination.					setExits(null, individuality, intuition, foreverYoung);
		this.individuality.					setExits(imagination, null, null, creativity);
		this.risk.							setExits(null, null, collaboration, intuition);
		this.collaboration.					setExits(null, null, null, risk);
		this.intuition.						setExits(null, null, risk, imagination);






	} // end scope: CONSTRUCTOR City



// ---------------------------------------------------------------------------------------------------- //




	// METHOD
	// invoked from GameControl.java class
	public Sanctuary getDefaultSanctuary()
	{


		// need the default sanctuary that the game will begin from
		return this.resilience;
	
	
	} // end scope: METHOD getDefaultSanctuary










} // end scope: CLASS City


