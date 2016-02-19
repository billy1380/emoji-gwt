//
//  Emoji.java
//  emoji-gwt
//
//  Created by William Shakour (billy1380) on 15 Nov 2014.
//  Copyright © 2014 WillShex Limited. All rights reserved.
//
package emoji.gwt.emoji;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeUri;

import emoji.gwt.emoji.res.Apple;
import emoji.gwt.emoji.res.Emojis;

public class Emoji {

	private static Emoji one = null;

	/**
	 * Get Emoji with default theme.
	 * 
	 * @return
	 */
	public static Emoji get () {
		return get(null);
	}

	/**
	 * Get Emoji with theme. Swapping between themes will cause a rebuild of the
	 * lookup.
	 * 
	 * @param theme
	 * @oaram ready
	 * @return
	 */
	public static Emoji get (Emojis theme) {
		if (one == null) {
			one = new Emoji();
		}

		return one.setTheme(theme);
	}

	private Map<String, ImageResource> lookup = null;
	private Emojis instance;

	/**
	 * 
	 */
	private void build () {
		lookup = new HashMap<String, ImageResource>();

		// smiling face with open mouth and smiling eyes
		lookup.put(":u1f604:", instance.u1f604());
		lookup.put(":smile:", instance.u1f604());
		// smiling face with open mouth
		lookup.put(":u1f603:", instance.u1f603());
		lookup.put(":smiley:", instance.u1f603());
		// grinning face
		lookup.put(":u1f600:", instance.u1f600());
		lookup.put(":grinning:", instance.u1f600());
		// smiling face with smiling eyes
		lookup.put(":u1f60a:", instance.u1f60a());
		lookup.put(":blush:", instance.u1f60a());
		// white smiling face
		lookup.put(":u263a:", instance.u263a());
		lookup.put(":relaxed:", instance.u263a());
		// winking face
		lookup.put(":u1f609:", instance.u1f609());
		lookup.put(":wink:", instance.u1f609());
		// smiling face with heart-shaped eyes
		lookup.put(":u1f60d:", instance.u1f60d());
		lookup.put(":heart_eyes:", instance.u1f60d());
		// face throwing a kiss
		lookup.put(":u1f618:", instance.u1f618());
		lookup.put(":kissing_heart:", instance.u1f618());
		// kissing face with closed eyes
		lookup.put(":u1f61a:", instance.u1f61a());
		lookup.put(":kissing_closed_eyes:", instance.u1f61a());
		// kissing face
		lookup.put(":u1f617:", instance.u1f617());
		lookup.put(":kissing:", instance.u1f617());
		// kissing face with smiling eyes
		lookup.put(":u1f619:", instance.u1f619());
		lookup.put(":kissing_smiling_eyes:", instance.u1f619());
		// face with stuck-out tongue and winking eye
		lookup.put(":u1f61c:", instance.u1f61c());
		lookup.put(":stuck_out_tongue_winking_eye:", instance.u1f61c());
		// face with stuck-out tongue and tightly-closed eyes
		lookup.put(":u1f61d:", instance.u1f61d());
		lookup.put(":stuck_out_tongue_closed_eyes:", instance.u1f61d());
		// face with stuck-out tongue
		lookup.put(":u1f61b:", instance.u1f61b());
		lookup.put(":stuck_out_tongue:", instance.u1f61b());
		// flushed face
		lookup.put(":u1f633:", instance.u1f633());
		lookup.put(":flushed:", instance.u1f633());
		// grinning face with smiling eyes
		lookup.put(":u1f601:", instance.u1f601());
		lookup.put(":grin:", instance.u1f601());
		// pensive face
		lookup.put(":u1f614:", instance.u1f614());
		lookup.put(":pensive:", instance.u1f614());
		// relieved face
		lookup.put(":u1f60c:", instance.u1f60c());
		lookup.put(":relieved:", instance.u1f60c());
		// unamused face
		lookup.put(":u1f612:", instance.u1f612());
		lookup.put(":unamused:", instance.u1f612());
		// disappointed face
		lookup.put(":u1f61e:", instance.u1f61e());
		lookup.put(":disappointed:", instance.u1f61e());
		// persevering face
		lookup.put(":u1f623:", instance.u1f623());
		lookup.put(":persevere:", instance.u1f623());
		// crying face
		lookup.put(":u1f622:", instance.u1f622());
		lookup.put(":cry:", instance.u1f622());
		// face with tears of joy
		lookup.put(":u1f602:", instance.u1f602());
		lookup.put(":joy:", instance.u1f602());
		// loudly crying face
		lookup.put(":u1f62d:", instance.u1f62d());
		lookup.put(":sob:", instance.u1f62d());
		// sleepy face
		lookup.put(":u1f62a:", instance.u1f62a());
		lookup.put(":sleepy:", instance.u1f62a());
		// disappointed but relieved face
		lookup.put(":u1f625:", instance.u1f625());
		lookup.put(":disappointed_relieved:", instance.u1f625());
		// face with open mouth and cold sweat
		lookup.put(":u1f630:", instance.u1f630());
		lookup.put(":cold_sweat:", instance.u1f630());
		// smiling face with open mouth and cold sweat
		lookup.put(":u1f605:", instance.u1f605());
		lookup.put(":sweat_smile:", instance.u1f605());
		// face with cold sweat
		lookup.put(":u1f613:", instance.u1f613());
		lookup.put(":sweat:", instance.u1f613());
		// weary face
		lookup.put(":u1f629:", instance.u1f629());
		lookup.put(":weary:", instance.u1f629());
		// tired face
		lookup.put(":u1f62b:", instance.u1f62b());
		lookup.put(":tired_face:", instance.u1f62b());
		// fearful face
		lookup.put(":u1f628:", instance.u1f628());
		lookup.put(":fearful:", instance.u1f628());
		// face screaming in fear
		lookup.put(":u1f631:", instance.u1f631());
		lookup.put(":scream:", instance.u1f631());
		// angry face
		lookup.put(":u1f620:", instance.u1f620());
		lookup.put(":angry:", instance.u1f620());
		// pouting face
		lookup.put(":u1f621:", instance.u1f621());
		lookup.put(":rage:", instance.u1f621());
		// face with look of triumph
		lookup.put(":u1f624:", instance.u1f624());
		lookup.put(":triumph:", instance.u1f624());
		// confounded face
		lookup.put(":u1f616:", instance.u1f616());
		lookup.put(":confounded:", instance.u1f616());
		// smiling face with open mouth and tightly-closed eyes
		lookup.put(":u1f606:", instance.u1f606());
		lookup.put(":laughing:", instance.u1f606());
		lookup.put(":satisfied:", instance.u1f606());
		// face savouring delicious food
		lookup.put(":u1f60b:", instance.u1f60b());
		lookup.put(":yum:", instance.u1f60b());
		// face with medical mask
		lookup.put(":u1f637:", instance.u1f637());
		lookup.put(":mask:", instance.u1f637());
		// smiling face with sunglasses
		lookup.put(":u1f60e:", instance.u1f60e());
		lookup.put(":sunglasses:", instance.u1f60e());
		// sleeping face
		lookup.put(":u1f634:", instance.u1f634());
		lookup.put(":sleeping:", instance.u1f634());
		// dizzy face
		lookup.put(":u1f635:", instance.u1f635());
		lookup.put(":dizzy_face:", instance.u1f635());
		// astonished face
		lookup.put(":u1f632:", instance.u1f632());
		lookup.put(":astonished:", instance.u1f632());
		// worried face
		lookup.put(":u1f61f:", instance.u1f61f());
		lookup.put(":worried:", instance.u1f61f());
		// frowning face with open mouth
		lookup.put(":u1f626:", instance.u1f626());
		lookup.put(":frowning:", instance.u1f626());
		// anguished face
		lookup.put(":u1f627:", instance.u1f627());
		lookup.put(":anguished:", instance.u1f627());
		// smiling face with horns
		lookup.put(":u1f608:", instance.u1f608());
		lookup.put(":smiling_imp:", instance.u1f608());
		// imp
		lookup.put(":u1f47f:", instance.u1f47f());
		lookup.put(":imp:", instance.u1f47f());
		// face with open mouth
		lookup.put(":u1f62e:", instance.u1f62e());
		lookup.put(":open_mouth:", instance.u1f62e());
		// grimacing face
		lookup.put(":u1f62c:", instance.u1f62c());
		lookup.put(":grimacing:", instance.u1f62c());
		// neutral face
		lookup.put(":u1f610:", instance.u1f610());
		lookup.put(":neutral_face:", instance.u1f610());
		// confused face
		lookup.put(":u1f615:", instance.u1f615());
		lookup.put(":confused:", instance.u1f615());
		// hushed face
		lookup.put(":u1f62f:", instance.u1f62f());
		lookup.put(":hushed:", instance.u1f62f());
		// face without mouth
		lookup.put(":u1f636:", instance.u1f636());
		lookup.put(":no_mouth:", instance.u1f636());
		// smiling face with halo
		lookup.put(":u1f607:", instance.u1f607());
		lookup.put(":innocent:", instance.u1f607());
		// smirking face
		lookup.put(":u1f60f:", instance.u1f60f());
		lookup.put(":smirk:", instance.u1f60f());
		// expressionless face
		lookup.put(":u1f611:", instance.u1f611());
		lookup.put(":expressionless:", instance.u1f611());
		// man with gua pi mao
		lookup.put(":u1f472:", instance.u1f472());
		lookup.put(":man_with_gua_pi_mao:", instance.u1f472());
		// man with turban
		lookup.put(":u1f473:", instance.u1f473());
		lookup.put(":man_with_turban:", instance.u1f473());
		// police officer
		lookup.put(":u1f46e:", instance.u1f46e());
		lookup.put(":cop:", instance.u1f46e());
		// construction worker
		lookup.put(":u1f477:", instance.u1f477());
		lookup.put(":construction_worker:", instance.u1f477());
		// guardsman
		lookup.put(":u1f482:", instance.u1f482());
		lookup.put(":guardsman:", instance.u1f482());
		// baby
		lookup.put(":u1f476:", instance.u1f476());
		lookup.put(":baby:", instance.u1f476());
		// boy
		lookup.put(":u1f466:", instance.u1f466());
		lookup.put(":boy:", instance.u1f466());
		// girl
		lookup.put(":u1f467:", instance.u1f467());
		lookup.put(":girl:", instance.u1f467());
		// man
		lookup.put(":u1f468:", instance.u1f468());
		lookup.put(":man:", instance.u1f468());
		// woman
		lookup.put(":u1f469:", instance.u1f469());
		lookup.put(":woman:", instance.u1f469());
		// older man
		lookup.put(":u1f474:", instance.u1f474());
		lookup.put(":older_man:", instance.u1f474());
		// older woman
		lookup.put(":u1f475:", instance.u1f475());
		lookup.put(":older_woman:", instance.u1f475());
		// person with blond hair
		lookup.put(":u1f471:", instance.u1f471());
		lookup.put(":person_with_blond_hair:", instance.u1f471());
		// baby angel
		lookup.put(":u1f47c:", instance.u1f47c());
		lookup.put(":angel:", instance.u1f47c());
		// princess
		lookup.put(":u1f478:", instance.u1f478());
		lookup.put(":princess:", instance.u1f478());
		// smiling cat face with open mouth
		lookup.put(":u1f63a:", instance.u1f63a());
		lookup.put(":smiley_cat:", instance.u1f63a());
		// grinning cat face with smiling eyes
		lookup.put(":u1f638:", instance.u1f638());
		lookup.put(":smile_cat:", instance.u1f638());
		// smiling cat face with heart-shaped eyes
		lookup.put(":u1f63b:", instance.u1f63b());
		lookup.put(":heart_eyes_cat:", instance.u1f63b());
		// kissing cat face with closed eyes
		lookup.put(":u1f63d:", instance.u1f63d());
		lookup.put(":kissing_cat:", instance.u1f63d());
		// cat face with wry smile
		lookup.put(":u1f63c:", instance.u1f63c());
		lookup.put(":smirk_cat:", instance.u1f63c());
		// weary cat face
		lookup.put(":u1f640:", instance.u1f640());
		lookup.put(":scream_cat:", instance.u1f640());
		// crying cat face
		lookup.put(":u1f63f:", instance.u1f63f());
		lookup.put(":crying_cat_face:", instance.u1f63f());
		// cat face with tears of joy
		lookup.put(":u1f639:", instance.u1f639());
		lookup.put(":joy_cat:", instance.u1f639());
		// pouting cat face
		lookup.put(":u1f63e:", instance.u1f63e());
		lookup.put(":pouting_cat:", instance.u1f63e());
		// japanese ogre
		lookup.put(":u1f479:", instance.u1f479());
		lookup.put(":japanese_ogre:", instance.u1f479());
		// japanese goblin
		lookup.put(":u1f47a:", instance.u1f47a());
		lookup.put(":japanese_goblin:", instance.u1f47a());
		// see-no-evil monkey
		lookup.put(":u1f648:", instance.u1f648());
		lookup.put(":see_no_evil:", instance.u1f648());
		// hear-no-evil monkey
		lookup.put(":u1f649:", instance.u1f649());
		lookup.put(":hear_no_evil:", instance.u1f649());
		// speak-no-evil monkey
		lookup.put(":u1f64a:", instance.u1f64a());
		lookup.put(":speak_no_evil:", instance.u1f64a());
		// skull
		lookup.put(":u1f480:", instance.u1f480());
		lookup.put(":skull:", instance.u1f480());
		// extraterrestrial alien
		lookup.put(":u1f47d:", instance.u1f47d());
		lookup.put(":alien:", instance.u1f47d());
		// pile of poo
		lookup.put(":u1f4a9:", instance.u1f4a9());
		lookup.put(":hankey:", instance.u1f4a9());
		lookup.put(":poop:", instance.u1f4a9());
		lookup.put(":shit:", instance.u1f4a9());
		// fire
		lookup.put(":u1f525:", instance.u1f525());
		lookup.put(":fire:", instance.u1f525());
		// sparkles
		lookup.put(":u2728:", instance.u2728());
		lookup.put(":sparkles:", instance.u2728());
		// glowing star
		lookup.put(":u1f31f:", instance.u1f31f());
		lookup.put(":star2:", instance.u1f31f());
		// dizzy symbol
		lookup.put(":u1f4ab:", instance.u1f4ab());
		lookup.put(":dizzy:", instance.u1f4ab());
		// collision symbol
		lookup.put(":u1f4a5:", instance.u1f4a5());
		lookup.put(":boom:", instance.u1f4a5());
		lookup.put(":collision:", instance.u1f4a5());
		// anger symbol
		lookup.put(":u1f4a2:", instance.u1f4a2());
		lookup.put(":anger:", instance.u1f4a2());
		// splashing sweat symbol
		lookup.put(":u1f4a6:", instance.u1f4a6());
		lookup.put(":sweat_drops:", instance.u1f4a6());
		// droplet
		lookup.put(":u1f4a7:", instance.u1f4a7());
		lookup.put(":droplet:", instance.u1f4a7());
		// sleeping symbol
		lookup.put(":u1f4a4:", instance.u1f4a4());
		lookup.put(":zzz:", instance.u1f4a4());
		// dash symbol
		lookup.put(":u1f4a8:", instance.u1f4a8());
		lookup.put(":dash:", instance.u1f4a8());
		// ear
		lookup.put(":u1f442:", instance.u1f442());
		lookup.put(":ear:", instance.u1f442());
		// eyes
		lookup.put(":u1f440:", instance.u1f440());
		lookup.put(":eyes:", instance.u1f440());
		// nose
		lookup.put(":u1f443:", instance.u1f443());
		lookup.put(":nose:", instance.u1f443());
		// tongue
		lookup.put(":u1f445:", instance.u1f445());
		lookup.put(":tongue:", instance.u1f445());
		// mouth
		lookup.put(":u1f444:", instance.u1f444());
		lookup.put(":lips:", instance.u1f444());
		// thumbs up sign
		lookup.put(":u1f44d:", instance.u1f44d());
		lookup.put(":+1:", instance.u1f44d());
		lookup.put(":thumbsup:", instance.u1f44d());
		// thumbs down sign
		lookup.put(":u1f44e:", instance.u1f44e());
		lookup.put(":-1:", instance.u1f44e());
		lookup.put(":thumbsdown:", instance.u1f44e());
		// ok hand sign
		lookup.put(":u1f44c:", instance.u1f44c());
		lookup.put(":ok_hand:", instance.u1f44c());
		// fisted hand sign
		lookup.put(":u1f44a:", instance.u1f44a());
		lookup.put(":facepunch:", instance.u1f44a());
		lookup.put(":punch:", instance.u1f44a());
		// raised fist
		lookup.put(":u270a:", instance.u270a());
		lookup.put(":fist:", instance.u270a());
		// victory hand
		lookup.put(":u270c:", instance.u270c());
		lookup.put(":v:", instance.u270c());
		// waving hand sign
		lookup.put(":u1f44b:", instance.u1f44b());
		lookup.put(":wave:", instance.u1f44b());
		// raised hand
		lookup.put(":u270b:", instance.u270b());
		lookup.put(":hand:", instance.u270b());
		lookup.put(":raised_hand:", instance.u270b());
		// open hands sign
		lookup.put(":u1f450:", instance.u1f450());
		lookup.put(":open_hands:", instance.u1f450());
		// white up pointing backhand index
		lookup.put(":u1f446:", instance.u1f446());
		lookup.put(":point_up_2:", instance.u1f446());
		// white down pointing backhand index
		lookup.put(":u1f447:", instance.u1f447());
		lookup.put(":point_down:", instance.u1f447());
		// white right pointing backhand index
		lookup.put(":u1f449:", instance.u1f449());
		lookup.put(":point_right:", instance.u1f449());
		// white left pointing backhand index
		lookup.put(":u1f448:", instance.u1f448());
		lookup.put(":point_left:", instance.u1f448());
		// person raising both hands in celebration
		lookup.put(":u1f64c:", instance.u1f64c());
		lookup.put(":raised_hands:", instance.u1f64c());
		// person with folded hands
		lookup.put(":u1f64f:", instance.u1f64f());
		lookup.put(":pray:", instance.u1f64f());
		// white up pointing index
		lookup.put(":u261d:", instance.u261d());
		lookup.put(":point_up:", instance.u261d());
		// clapping hands sign
		lookup.put(":u1f44f:", instance.u1f44f());
		lookup.put(":clap:", instance.u1f44f());
		// flexed biceps
		lookup.put(":u1f4aa:", instance.u1f4aa());
		lookup.put(":muscle:", instance.u1f4aa());
		// pedestrian
		lookup.put(":u1f6b6:", instance.u1f6b6());
		lookup.put(":walking:", instance.u1f6b6());
		// runner
		lookup.put(":u1f3c3:", instance.u1f3c3());
		lookup.put(":runner:", instance.u1f3c3());
		lookup.put(":running:", instance.u1f3c3());
		// dancer
		lookup.put(":u1f483:", instance.u1f483());
		lookup.put(":dancer:", instance.u1f483());
		// man and woman holding hands
		lookup.put(":u1f46b:", instance.u1f46b());
		lookup.put(":couple:", instance.u1f46b());
		// family
		lookup.put(":u1f46a:", instance.u1f46a());
		lookup.put(":family:", instance.u1f46a());
		// two men holding hands
		lookup.put(":u1f46c:", instance.u1f46c());
		lookup.put(":two_men_holding_hands:", instance.u1f46c());
		// two women holding hands
		lookup.put(":u1f46d:", instance.u1f46d());
		lookup.put(":two_women_holding_hands:", instance.u1f46d());
		// kiss
		lookup.put(":u1f48f:", instance.u1f48f());
		lookup.put(":couplekiss:", instance.u1f48f());
		// couple with heart
		lookup.put(":u1f491:", instance.u1f491());
		lookup.put(":couple_with_heart:", instance.u1f491());
		// woman with bunny ears
		lookup.put(":u1f46f:", instance.u1f46f());
		lookup.put(":dancers:", instance.u1f46f());
		// face with ok gesture
		lookup.put(":u1f646:", instance.u1f646());
		lookup.put(":ok_woman:", instance.u1f646());
		// face with no good gesture
		lookup.put(":u1f645:", instance.u1f645());
		lookup.put(":no_good:", instance.u1f645());
		// information desk person
		lookup.put(":u1f481:", instance.u1f481());
		lookup.put(":information_desk_person:", instance.u1f481());
		// happy person raising one hand
		lookup.put(":u1f64b:", instance.u1f64b());
		lookup.put(":raising_hand:", instance.u1f64b());
		// face massage
		lookup.put(":u1f486:", instance.u1f486());
		lookup.put(":massage:", instance.u1f486());
		// haircut
		lookup.put(":u1f487:", instance.u1f487());
		lookup.put(":haircut:", instance.u1f487());
		// nail polish
		lookup.put(":u1f485:", instance.u1f485());
		lookup.put(":nail_care:", instance.u1f485());
		// bride with veil
		lookup.put(":u1f470:", instance.u1f470());
		lookup.put(":bride_with_veil:", instance.u1f470());
		// person with pouting face
		lookup.put(":u1f64e:", instance.u1f64e());
		lookup.put(":person_with_pouting_face:", instance.u1f64e());
		// person frowning
		lookup.put(":u1f64d:", instance.u1f64d());
		lookup.put(":person_frowning:", instance.u1f64d());
		// person bowing deeply
		lookup.put(":u1f647:", instance.u1f647());
		lookup.put(":bow:", instance.u1f647());
		// top hat
		lookup.put(":u1f3a9:", instance.u1f3a9());
		lookup.put(":tophat:", instance.u1f3a9());
		// crown
		lookup.put(":u1f451:", instance.u1f451());
		lookup.put(":crown:", instance.u1f451());
		// womans hat
		lookup.put(":u1f452:", instance.u1f452());
		lookup.put(":womans_hat:", instance.u1f452());
		// athletic shoe
		lookup.put(":u1f45f:", instance.u1f45f());
		lookup.put(":athletic_shoe:", instance.u1f45f());
		// mans shoe
		lookup.put(":u1f45e:", instance.u1f45e());
		lookup.put(":mans_shoe:", instance.u1f45e());
		lookup.put(":shoe:", instance.u1f45e());
		// womans sandal
		lookup.put(":u1f461:", instance.u1f461());
		lookup.put(":sandal:", instance.u1f461());
		// high-heeled shoe
		lookup.put(":u1f460:", instance.u1f460());
		lookup.put(":high_heel:", instance.u1f460());
		// womans boots
		lookup.put(":u1f462:", instance.u1f462());
		lookup.put(":boot:", instance.u1f462());
		// t-shirt
		lookup.put(":u1f455:", instance.u1f455());
		lookup.put(":shirt:", instance.u1f455());
		lookup.put(":tshirt:", instance.u1f455());
		// necktie
		lookup.put(":u1f454:", instance.u1f454());
		lookup.put(":necktie:", instance.u1f454());
		// womans clothes
		lookup.put(":u1f45a:", instance.u1f45a());
		lookup.put(":womans_clothes:", instance.u1f45a());
		// dress
		lookup.put(":u1f457:", instance.u1f457());
		lookup.put(":dress:", instance.u1f457());
		// running shirt with sash
		lookup.put(":u1f3bd:", instance.u1f3bd());
		lookup.put(":running_shirt_with_sash:", instance.u1f3bd());
		// jeans
		lookup.put(":u1f456:", instance.u1f456());
		lookup.put(":jeans:", instance.u1f456());
		// kimono
		lookup.put(":u1f458:", instance.u1f458());
		lookup.put(":kimono:", instance.u1f458());
		// bikini
		lookup.put(":u1f459:", instance.u1f459());
		lookup.put(":bikini:", instance.u1f459());
		// briefcase
		lookup.put(":u1f4bc:", instance.u1f4bc());
		lookup.put(":briefcase:", instance.u1f4bc());
		// handbag
		lookup.put(":u1f45c:", instance.u1f45c());
		lookup.put(":handbag:", instance.u1f45c());
		// pouch
		lookup.put(":u1f45d:", instance.u1f45d());
		lookup.put(":pouch:", instance.u1f45d());
		// purse
		lookup.put(":u1f45b:", instance.u1f45b());
		lookup.put(":purse:", instance.u1f45b());
		// eyeglasses
		lookup.put(":u1f453:", instance.u1f453());
		lookup.put(":eyeglasses:", instance.u1f453());
		// ribbon
		lookup.put(":u1f380:", instance.u1f380());
		lookup.put(":ribbon:", instance.u1f380());
		// closed umbrella
		lookup.put(":u1f302:", instance.u1f302());
		lookup.put(":closed_umbrella:", instance.u1f302());
		// lipstick
		lookup.put(":u1f484:", instance.u1f484());
		lookup.put(":lipstick:", instance.u1f484());
		// yellow heart
		lookup.put(":u1f49b:", instance.u1f49b());
		lookup.put(":yellow_heart:", instance.u1f49b());
		// blue heart
		lookup.put(":u1f499:", instance.u1f499());
		lookup.put(":blue_heart:", instance.u1f499());
		// purple heart
		lookup.put(":u1f49c:", instance.u1f49c());
		lookup.put(":purple_heart:", instance.u1f49c());
		// green heart
		lookup.put(":u1f49a:", instance.u1f49a());
		lookup.put(":green_heart:", instance.u1f49a());
		// heavy black heart
		lookup.put(":u2764:", instance.u2764());
		lookup.put(":heart:", instance.u2764());
		// broken heart
		lookup.put(":u1f494:", instance.u1f494());
		lookup.put(":broken_heart:", instance.u1f494());
		// growing heart
		lookup.put(":u1f497:", instance.u1f497());
		lookup.put(":heartpulse:", instance.u1f497());
		// beating heart
		lookup.put(":u1f493:", instance.u1f493());
		lookup.put(":heartbeat:", instance.u1f493());
		// two hearts
		lookup.put(":u1f495:", instance.u1f495());
		lookup.put(":two_hearts:", instance.u1f495());
		// sparkling heart
		lookup.put(":u1f496:", instance.u1f496());
		lookup.put(":sparkling_heart:", instance.u1f496());
		// revolving hearts
		lookup.put(":u1f49e:", instance.u1f49e());
		lookup.put(":revolving_hearts:", instance.u1f49e());
		// heart with arrow
		lookup.put(":u1f498:", instance.u1f498());
		lookup.put(":cupid:", instance.u1f498());
		// love letter
		lookup.put(":u1f48c:", instance.u1f48c());
		lookup.put(":love_letter:", instance.u1f48c());
		// kiss mark
		lookup.put(":u1f48b:", instance.u1f48b());
		lookup.put(":kiss:", instance.u1f48b());
		// ring
		lookup.put(":u1f48d:", instance.u1f48d());
		lookup.put(":ring:", instance.u1f48d());
		// gem stone
		lookup.put(":u1f48e:", instance.u1f48e());
		lookup.put(":gem:", instance.u1f48e());
		// bust in silhouette
		lookup.put(":u1f464:", instance.u1f464());
		lookup.put(":bust_in_silhouette:", instance.u1f464());
		// busts in silhouette
		lookup.put(":u1f465:", instance.u1f465());
		lookup.put(":busts_in_silhouette:", instance.u1f465());
		// speech balloon
		lookup.put(":u1f4ac:", instance.u1f4ac());
		lookup.put(":speech_balloon:", instance.u1f4ac());
		// footprints
		lookup.put(":u1f463:", instance.u1f463());
		lookup.put(":footprints:", instance.u1f463());
		// thought balloon
		lookup.put(":u1f4ad:", instance.u1f4ad());
		lookup.put(":thought_balloon:", instance.u1f4ad());
		// dog face
		lookup.put(":u1f436:", instance.u1f436());
		lookup.put(":dog:", instance.u1f436());
		// wolf face
		lookup.put(":u1f43a:", instance.u1f43a());
		lookup.put(":wolf:", instance.u1f43a());
		// cat face
		lookup.put(":u1f431:", instance.u1f431());
		lookup.put(":cat:", instance.u1f431());
		// mouse face
		lookup.put(":u1f42d:", instance.u1f42d());
		lookup.put(":mouse:", instance.u1f42d());
		// hamster face
		lookup.put(":u1f439:", instance.u1f439());
		lookup.put(":hamster:", instance.u1f439());
		// rabbit face
		lookup.put(":u1f430:", instance.u1f430());
		lookup.put(":rabbit:", instance.u1f430());
		// frog face
		lookup.put(":u1f438:", instance.u1f438());
		lookup.put(":frog:", instance.u1f438());
		// tiger face
		lookup.put(":u1f42f:", instance.u1f42f());
		lookup.put(":tiger:", instance.u1f42f());
		// koala
		lookup.put(":u1f428:", instance.u1f428());
		lookup.put(":koala:", instance.u1f428());
		// bear face
		lookup.put(":u1f43b:", instance.u1f43b());
		lookup.put(":bear:", instance.u1f43b());
		// pig face
		lookup.put(":u1f437:", instance.u1f437());
		lookup.put(":pig:", instance.u1f437());
		// pig nose
		lookup.put(":u1f43d:", instance.u1f43d());
		lookup.put(":pig_nose:", instance.u1f43d());
		// cow face
		lookup.put(":u1f42e:", instance.u1f42e());
		lookup.put(":cow:", instance.u1f42e());
		// boar
		lookup.put(":u1f417:", instance.u1f417());
		lookup.put(":boar:", instance.u1f417());
		// monkey face
		lookup.put(":u1f435:", instance.u1f435());
		lookup.put(":monkey_face:", instance.u1f435());
		// monkey
		lookup.put(":u1f412:", instance.u1f412());
		lookup.put(":monkey:", instance.u1f412());
		// horse face
		lookup.put(":u1f434:", instance.u1f434());
		lookup.put(":horse:", instance.u1f434());
		// sheep
		lookup.put(":u1f411:", instance.u1f411());
		lookup.put(":sheep:", instance.u1f411());
		// elephant
		lookup.put(":u1f418:", instance.u1f418());
		lookup.put(":elephant:", instance.u1f418());
		// panda face
		lookup.put(":u1f43c:", instance.u1f43c());
		lookup.put(":panda_face:", instance.u1f43c());
		// penguin
		lookup.put(":u1f427:", instance.u1f427());
		lookup.put(":penguin:", instance.u1f427());
		// bird
		lookup.put(":u1f426:", instance.u1f426());
		lookup.put(":bird:", instance.u1f426());
		// baby chick
		lookup.put(":u1f424:", instance.u1f424());
		lookup.put(":baby_chick:", instance.u1f424());
		// front-facing baby chick
		lookup.put(":u1f425:", instance.u1f425());
		lookup.put(":hatched_chick:", instance.u1f425());
		// hatching chick
		lookup.put(":u1f423:", instance.u1f423());
		lookup.put(":hatching_chick:", instance.u1f423());
		// chicken
		lookup.put(":u1f414:", instance.u1f414());
		lookup.put(":chicken:", instance.u1f414());
		// snake
		lookup.put(":u1f40d:", instance.u1f40d());
		lookup.put(":snake:", instance.u1f40d());
		// turtle
		lookup.put(":u1f422:", instance.u1f422());
		lookup.put(":turtle:", instance.u1f422());
		// bug
		lookup.put(":u1f41b:", instance.u1f41b());
		lookup.put(":bug:", instance.u1f41b());
		// honeybee
		lookup.put(":u1f41d:", instance.u1f41d());
		lookup.put(":bee:", instance.u1f41d());
		lookup.put(":honeybee:", instance.u1f41d());
		// ant
		lookup.put(":u1f41c:", instance.u1f41c());
		lookup.put(":ant:", instance.u1f41c());
		// lady beetle
		lookup.put(":u1f41e:", instance.u1f41e());
		lookup.put(":beetle:", instance.u1f41e());
		// snail
		lookup.put(":u1f40c:", instance.u1f40c());
		lookup.put(":snail:", instance.u1f40c());
		// octopus
		lookup.put(":u1f419:", instance.u1f419());
		lookup.put(":octopus:", instance.u1f419());
		// spiral shell
		lookup.put(":u1f41a:", instance.u1f41a());
		lookup.put(":shell:", instance.u1f41a());
		// tropical fish
		lookup.put(":u1f420:", instance.u1f420());
		lookup.put(":tropical_fish:", instance.u1f420());
		// fish
		lookup.put(":u1f41f:", instance.u1f41f());
		lookup.put(":fish:", instance.u1f41f());
		// dolphin
		lookup.put(":u1f42c:", instance.u1f42c());
		lookup.put(":dolphin:", instance.u1f42c());
		lookup.put(":flipper:", instance.u1f42c());
		// spouting whale
		lookup.put(":u1f433:", instance.u1f433());
		lookup.put(":whale:", instance.u1f433());
		// whale
		lookup.put(":u1f40b:", instance.u1f40b());
		lookup.put(":whale2:", instance.u1f40b());
		// cow
		lookup.put(":u1f404:", instance.u1f404());
		lookup.put(":cow2:", instance.u1f404());
		// ram
		lookup.put(":u1f40f:", instance.u1f40f());
		lookup.put(":ram:", instance.u1f40f());
		// rat
		lookup.put(":u1f400:", instance.u1f400());
		lookup.put(":rat:", instance.u1f400());
		// water buffalo
		lookup.put(":u1f403:", instance.u1f403());
		lookup.put(":water_buffalo:", instance.u1f403());
		// tiger
		lookup.put(":u1f405:", instance.u1f405());
		lookup.put(":tiger2:", instance.u1f405());
		// rabbit
		lookup.put(":u1f407:", instance.u1f407());
		lookup.put(":rabbit2:", instance.u1f407());
		// dragon
		lookup.put(":u1f409:", instance.u1f409());
		lookup.put(":dragon:", instance.u1f409());
		// horse
		lookup.put(":u1f40e:", instance.u1f40e());
		lookup.put(":racehorse:", instance.u1f40e());
		// goat
		lookup.put(":u1f410:", instance.u1f410());
		lookup.put(":goat:", instance.u1f410());
		// rooster
		lookup.put(":u1f413:", instance.u1f413());
		lookup.put(":rooster:", instance.u1f413());
		// dog
		lookup.put(":u1f415:", instance.u1f415());
		lookup.put(":dog2:", instance.u1f415());
		// pig
		lookup.put(":u1f416:", instance.u1f416());
		lookup.put(":pig2:", instance.u1f416());
		// mouse
		lookup.put(":u1f401:", instance.u1f401());
		lookup.put(":mouse2:", instance.u1f401());
		// ox
		lookup.put(":u1f402:", instance.u1f402());
		lookup.put(":ox:", instance.u1f402());
		// dragon face
		lookup.put(":u1f432:", instance.u1f432());
		lookup.put(":dragon_face:", instance.u1f432());
		// blowfish
		lookup.put(":u1f421:", instance.u1f421());
		lookup.put(":blowfish:", instance.u1f421());
		// crocodile
		lookup.put(":u1f40a:", instance.u1f40a());
		lookup.put(":crocodile:", instance.u1f40a());
		// bactrian camel
		lookup.put(":u1f42b:", instance.u1f42b());
		lookup.put(":camel:", instance.u1f42b());
		// dromedary camel
		lookup.put(":u1f42a:", instance.u1f42a());
		lookup.put(":dromedary_camel:", instance.u1f42a());
		// leopard
		lookup.put(":u1f406:", instance.u1f406());
		lookup.put(":leopard:", instance.u1f406());
		// cat
		lookup.put(":u1f408:", instance.u1f408());
		lookup.put(":cat2:", instance.u1f408());
		// poodle
		lookup.put(":u1f429:", instance.u1f429());
		lookup.put(":poodle:", instance.u1f429());
		// paw prints
		lookup.put(":u1f43e:", instance.u1f43e());
		lookup.put(":feet:", instance.u1f43e());
		lookup.put(":paw_prints:", instance.u1f43e());
		// bouquet
		lookup.put(":u1f490:", instance.u1f490());
		lookup.put(":bouquet:", instance.u1f490());
		// cherry blossom
		lookup.put(":u1f338:", instance.u1f338());
		lookup.put(":cherry_blossom:", instance.u1f338());
		// tulip
		lookup.put(":u1f337:", instance.u1f337());
		lookup.put(":tulip:", instance.u1f337());
		// four leaf clover
		lookup.put(":u1f340:", instance.u1f340());
		lookup.put(":four_leaf_clover:", instance.u1f340());
		// rose
		lookup.put(":u1f339:", instance.u1f339());
		lookup.put(":rose:", instance.u1f339());
		// sunflower
		lookup.put(":u1f33b:", instance.u1f33b());
		lookup.put(":sunflower:", instance.u1f33b());
		// hibiscus
		lookup.put(":u1f33a:", instance.u1f33a());
		lookup.put(":hibiscus:", instance.u1f33a());
		// maple leaf
		lookup.put(":u1f341:", instance.u1f341());
		lookup.put(":maple_leaf:", instance.u1f341());
		// leaf fluttering in wind
		lookup.put(":u1f343:", instance.u1f343());
		lookup.put(":leaves:", instance.u1f343());
		// fallen leaf
		lookup.put(":u1f342:", instance.u1f342());
		lookup.put(":fallen_leaf:", instance.u1f342());
		// herb
		lookup.put(":u1f33f:", instance.u1f33f());
		lookup.put(":herb:", instance.u1f33f());
		// ear of rice
		lookup.put(":u1f33e:", instance.u1f33e());
		lookup.put(":ear_of_rice:", instance.u1f33e());
		// mushroom
		lookup.put(":u1f344:", instance.u1f344());
		lookup.put(":mushroom:", instance.u1f344());
		// cactus
		lookup.put(":u1f335:", instance.u1f335());
		lookup.put(":cactus:", instance.u1f335());
		// palm tree
		lookup.put(":u1f334:", instance.u1f334());
		lookup.put(":palm_tree:", instance.u1f334());
		// evergreen tree
		lookup.put(":u1f332:", instance.u1f332());
		lookup.put(":evergreen_tree:", instance.u1f332());
		// deciduous tree
		lookup.put(":u1f333:", instance.u1f333());
		lookup.put(":deciduous_tree:", instance.u1f333());
		// chestnut
		lookup.put(":u1f330:", instance.u1f330());
		lookup.put(":chestnut:", instance.u1f330());
		// seedling
		lookup.put(":u1f331:", instance.u1f331());
		lookup.put(":seedling:", instance.u1f331());
		// blossom
		lookup.put(":u1f33c:", instance.u1f33c());
		lookup.put(":blossom:", instance.u1f33c());
		// globe with meridians
		lookup.put(":u1f310:", instance.u1f310());
		lookup.put(":globe_with_meridians:", instance.u1f310());
		// sun with face
		lookup.put(":u1f31e:", instance.u1f31e());
		lookup.put(":sun_with_face:", instance.u1f31e());
		// full moon with face
		lookup.put(":u1f31d:", instance.u1f31d());
		lookup.put(":full_moon_with_face:", instance.u1f31d());
		// new moon with face
		lookup.put(":u1f31a:", instance.u1f31a());
		lookup.put(":new_moon_with_face:", instance.u1f31a());
		// new moon symbol
		lookup.put(":u1f311:", instance.u1f311());
		lookup.put(":new_moon:", instance.u1f311());
		// waxing crescent moon symbol
		lookup.put(":u1f312:", instance.u1f312());
		lookup.put(":waxing_crescent_moon:", instance.u1f312());
		// first quarter moon symbol
		lookup.put(":u1f313:", instance.u1f313());
		lookup.put(":first_quarter_moon:", instance.u1f313());
		// waxing gibbous moon symbol
		lookup.put(":u1f314:", instance.u1f314());
		lookup.put(":moon:", instance.u1f314());
		lookup.put(":waxing_gibbous_moon:", instance.u1f314());
		// full moon symbol
		lookup.put(":u1f315:", instance.u1f315());
		lookup.put(":full_moon:", instance.u1f315());
		// waning gibbous moon symbol
		lookup.put(":u1f316:", instance.u1f316());
		lookup.put(":waning_gibbous_moon:", instance.u1f316());
		// last quarter moon symbol
		lookup.put(":u1f317:", instance.u1f317());
		lookup.put(":last_quarter_moon:", instance.u1f317());
		// waning crescent moon symbol
		lookup.put(":u1f318:", instance.u1f318());
		lookup.put(":waning_crescent_moon:", instance.u1f318());
		// last quarter moon with face
		lookup.put(":u1f31c:", instance.u1f31c());
		lookup.put(":last_quarter_moon_with_face:", instance.u1f31c());
		// first quarter moon with face
		lookup.put(":u1f31b:", instance.u1f31b());
		lookup.put(":first_quarter_moon_with_face:", instance.u1f31b());
		// crescent moon
		lookup.put(":u1f319:", instance.u1f319());
		lookup.put(":crescent_moon:", instance.u1f319());
		// earth globe europe-africa
		lookup.put(":u1f30d:", instance.u1f30d());
		lookup.put(":earth_africa:", instance.u1f30d());
		// earth globe americas
		lookup.put(":u1f30e:", instance.u1f30e());
		lookup.put(":earth_americas:", instance.u1f30e());
		// earth globe asia-australia
		lookup.put(":u1f30f:", instance.u1f30f());
		lookup.put(":earth_asia:", instance.u1f30f());
		// volcano
		lookup.put(":u1f30b:", instance.u1f30b());
		lookup.put(":volcano:", instance.u1f30b());
		// milky way
		lookup.put(":u1f30c:", instance.u1f30c());
		lookup.put(":milky_way:", instance.u1f30c());
		// shooting star
		lookup.put(":u1f320:", instance.u1f320());
		lookup.put(":stars:", instance.u1f320());
		// white medium star
		lookup.put(":u2b50:", instance.u2b50());
		lookup.put(":star:", instance.u2b50());
		// black sun with rays
		lookup.put(":u2600:", instance.u2600());
		lookup.put(":sunny:", instance.u2600());
		// sun behind cloud
		lookup.put(":u26c5:", instance.u26c5());
		lookup.put(":partly_sunny:", instance.u26c5());
		// cloud
		lookup.put(":u2601:", instance.u2601());
		lookup.put(":cloud:", instance.u2601());
		// high voltage sign
		lookup.put(":u26a1:", instance.u26a1());
		lookup.put(":zap:", instance.u26a1());
		// umbrella with rain drops
		lookup.put(":u2614:", instance.u2614());
		lookup.put(":umbrella:", instance.u2614());
		// snowflake
		lookup.put(":u2744:", instance.u2744());
		lookup.put(":snowflake:", instance.u2744());
		// snowman without snow
		lookup.put(":u26c4:", instance.u26c4());
		lookup.put(":snowman:", instance.u26c4());
		// cyclone
		lookup.put(":u1f300:", instance.u1f300());
		lookup.put(":cyclone:", instance.u1f300());
		// foggy
		lookup.put(":u1f301:", instance.u1f301());
		lookup.put(":foggy:", instance.u1f301());
		// rainbow
		lookup.put(":u1f308:", instance.u1f308());
		lookup.put(":rainbow:", instance.u1f308());
		// water wave
		lookup.put(":u1f30a:", instance.u1f30a());
		lookup.put(":ocean:", instance.u1f30a());
		// pine decoration
		lookup.put(":u1f38d:", instance.u1f38d());
		lookup.put(":bamboo:", instance.u1f38d());
		// heart with ribbon
		lookup.put(":u1f49d:", instance.u1f49d());
		lookup.put(":gift_heart:", instance.u1f49d());
		// japanese dolls
		lookup.put(":u1f38e:", instance.u1f38e());
		lookup.put(":dolls:", instance.u1f38e());
		// school satchel
		lookup.put(":u1f392:", instance.u1f392());
		lookup.put(":school_satchel:", instance.u1f392());
		// graduation cap
		lookup.put(":u1f393:", instance.u1f393());
		lookup.put(":mortar_board:", instance.u1f393());
		// carp streamer
		lookup.put(":u1f38f:", instance.u1f38f());
		lookup.put(":flags:", instance.u1f38f());
		// fireworks
		lookup.put(":u1f386:", instance.u1f386());
		lookup.put(":fireworks:", instance.u1f386());
		// firework sparkler
		lookup.put(":u1f387:", instance.u1f387());
		lookup.put(":sparkler:", instance.u1f387());
		// wind chime
		lookup.put(":u1f390:", instance.u1f390());
		lookup.put(":wind_chime:", instance.u1f390());
		// moon viewing ceremony
		lookup.put(":u1f391:", instance.u1f391());
		lookup.put(":rice_scene:", instance.u1f391());
		// jack-o-lantern
		lookup.put(":u1f383:", instance.u1f383());
		lookup.put(":jack_o_lantern:", instance.u1f383());
		// ghost
		lookup.put(":u1f47b:", instance.u1f47b());
		lookup.put(":ghost:", instance.u1f47b());
		// father christmas
		lookup.put(":u1f385:", instance.u1f385());
		lookup.put(":santa:", instance.u1f385());
		// christmas tree
		lookup.put(":u1f384:", instance.u1f384());
		lookup.put(":christmas_tree:", instance.u1f384());
		// wrapped present
		lookup.put(":u1f381:", instance.u1f381());
		lookup.put(":gift:", instance.u1f381());
		// tanabata tree
		lookup.put(":u1f38b:", instance.u1f38b());
		lookup.put(":tanabata_tree:", instance.u1f38b());
		// party popper
		lookup.put(":u1f389:", instance.u1f389());
		lookup.put(":tada:", instance.u1f389());
		// confetti ball
		lookup.put(":u1f38a:", instance.u1f38a());
		lookup.put(":confetti_ball:", instance.u1f38a());
		// balloon
		lookup.put(":u1f388:", instance.u1f388());
		lookup.put(":balloon:", instance.u1f388());
		// crossed flags
		lookup.put(":u1f38c:", instance.u1f38c());
		lookup.put(":crossed_flags:", instance.u1f38c());
		// crystal ball
		lookup.put(":u1f52e:", instance.u1f52e());
		lookup.put(":crystal_ball:", instance.u1f52e());
		// movie camera
		lookup.put(":u1f3a5:", instance.u1f3a5());
		lookup.put(":movie_camera:", instance.u1f3a5());
		// camera
		lookup.put(":u1f4f7:", instance.u1f4f7());
		lookup.put(":camera:", instance.u1f4f7());
		// video camera
		lookup.put(":u1f4f9:", instance.u1f4f9());
		lookup.put(":video_camera:", instance.u1f4f9());
		// videocassette
		lookup.put(":u1f4fc:", instance.u1f4fc());
		lookup.put(":vhs:", instance.u1f4fc());
		// optical disc
		lookup.put(":u1f4bf:", instance.u1f4bf());
		lookup.put(":cd:", instance.u1f4bf());
		// dvd
		lookup.put(":u1f4c0:", instance.u1f4c0());
		lookup.put(":dvd:", instance.u1f4c0());
		// minidisc
		lookup.put(":u1f4bd:", instance.u1f4bd());
		lookup.put(":minidisc:", instance.u1f4bd());
		// floppy disk
		lookup.put(":u1f4be:", instance.u1f4be());
		lookup.put(":floppy_disk:", instance.u1f4be());
		// personal computer
		lookup.put(":u1f4bb:", instance.u1f4bb());
		lookup.put(":computer:", instance.u1f4bb());
		// mobile phone
		lookup.put(":u1f4f1:", instance.u1f4f1());
		lookup.put(":iphone:", instance.u1f4f1());
		// black telephone
		lookup.put(":u260e:", instance.u260e());
		lookup.put(":phone:", instance.u260e());
		lookup.put(":telephone:", instance.u260e());
		// telephone receiver
		lookup.put(":u1f4de:", instance.u1f4de());
		lookup.put(":telephone_receiver:", instance.u1f4de());
		// pager
		lookup.put(":u1f4df:", instance.u1f4df());
		lookup.put(":pager:", instance.u1f4df());
		// fax machine
		lookup.put(":u1f4e0:", instance.u1f4e0());
		lookup.put(":fax:", instance.u1f4e0());
		// satellite antenna
		lookup.put(":u1f4e1:", instance.u1f4e1());
		lookup.put(":satellite:", instance.u1f4e1());
		// television
		lookup.put(":u1f4fa:", instance.u1f4fa());
		lookup.put(":tv:", instance.u1f4fa());
		// radio
		lookup.put(":u1f4fb:", instance.u1f4fb());
		lookup.put(":radio:", instance.u1f4fb());
		// speaker with three sound waves
		lookup.put(":u1f50a:", instance.u1f50a());
		lookup.put(":loud_sound:", instance.u1f50a());
		// speaker with one sound wave
		lookup.put(":u1f509:", instance.u1f509());
		lookup.put(":sound:", instance.u1f509());
		// speaker
		lookup.put(":u1f508:", instance.u1f508());
		lookup.put(":speaker:", instance.u1f508());
		// speaker with cancellation stroke
		lookup.put(":u1f507:", instance.u1f507());
		lookup.put(":mute:", instance.u1f507());
		// bell
		lookup.put(":u1f514:", instance.u1f514());
		lookup.put(":bell:", instance.u1f514());
		// bell with cancellation stroke
		lookup.put(":u1f515:", instance.u1f515());
		lookup.put(":no_bell:", instance.u1f515());
		// public address loudspeaker
		lookup.put(":u1f4e2:", instance.u1f4e2());
		lookup.put(":loudspeaker:", instance.u1f4e2());
		// cheering megaphone
		lookup.put(":u1f4e3:", instance.u1f4e3());
		lookup.put(":mega:", instance.u1f4e3());
		// hourglass with flowing sand
		lookup.put(":u23f3:", instance.u23f3());
		lookup.put(":hourglass_flowing_sand:", instance.u23f3());
		// hourglass
		lookup.put(":u231b:", instance.u231b());
		lookup.put(":hourglass:", instance.u231b());
		// alarm clock
		lookup.put(":u23f0:", instance.u23f0());
		lookup.put(":alarm_clock:", instance.u23f0());
		// watch
		lookup.put(":u231a:", instance.u231a());
		lookup.put(":watch:", instance.u231a());
		// open lock
		lookup.put(":u1f513:", instance.u1f513());
		lookup.put(":unlock:", instance.u1f513());
		// lock
		lookup.put(":u1f512:", instance.u1f512());
		lookup.put(":lock:", instance.u1f512());
		// lock with ink pen
		lookup.put(":u1f50f:", instance.u1f50f());
		lookup.put(":lock_with_ink_pen:", instance.u1f50f());
		// closed lock with key
		lookup.put(":u1f510:", instance.u1f510());
		lookup.put(":closed_lock_with_key:", instance.u1f510());
		// key
		lookup.put(":u1f511:", instance.u1f511());
		lookup.put(":key:", instance.u1f511());
		// right-pointing magnifying glass
		lookup.put(":u1f50e:", instance.u1f50e());
		lookup.put(":mag_right:", instance.u1f50e());
		// electric light bulb
		lookup.put(":u1f4a1:", instance.u1f4a1());
		lookup.put(":bulb:", instance.u1f4a1());
		// electric torch
		lookup.put(":u1f526:", instance.u1f526());
		lookup.put(":flashlight:", instance.u1f526());
		// high brightness symbol
		lookup.put(":u1f506:", instance.u1f506());
		lookup.put(":high_brightness:", instance.u1f506());
		// low brightness symbol
		lookup.put(":u1f505:", instance.u1f505());
		lookup.put(":low_brightness:", instance.u1f505());
		// electric plug
		lookup.put(":u1f50c:", instance.u1f50c());
		lookup.put(":electric_plug:", instance.u1f50c());
		// battery
		lookup.put(":u1f50b:", instance.u1f50b());
		lookup.put(":battery:", instance.u1f50b());
		// left-pointing magnifying glass
		lookup.put(":u1f50d:", instance.u1f50d());
		lookup.put(":mag:", instance.u1f50d());
		// bathtub
		lookup.put(":u1f6c1:", instance.u1f6c1());
		lookup.put(":bathtub:", instance.u1f6c1());
		// bath
		lookup.put(":u1f6c0:", instance.u1f6c0());
		lookup.put(":bath:", instance.u1f6c0());
		// shower
		lookup.put(":u1f6bf:", instance.u1f6bf());
		lookup.put(":shower:", instance.u1f6bf());
		// toilet
		lookup.put(":u1f6bd:", instance.u1f6bd());
		lookup.put(":toilet:", instance.u1f6bd());
		// wrench
		lookup.put(":u1f527:", instance.u1f527());
		lookup.put(":wrench:", instance.u1f527());
		// nut and bolt
		lookup.put(":u1f529:", instance.u1f529());
		lookup.put(":nut_and_bolt:", instance.u1f529());
		// hammer
		lookup.put(":u1f528:", instance.u1f528());
		lookup.put(":hammer:", instance.u1f528());
		// door
		lookup.put(":u1f6aa:", instance.u1f6aa());
		lookup.put(":door:", instance.u1f6aa());
		// smoking symbol
		lookup.put(":u1f6ac:", instance.u1f6ac());
		lookup.put(":smoking:", instance.u1f6ac());
		// bomb
		lookup.put(":u1f4a3:", instance.u1f4a3());
		lookup.put(":bomb:", instance.u1f4a3());
		// pistol
		lookup.put(":u1f52b:", instance.u1f52b());
		lookup.put(":gun:", instance.u1f52b());
		// hocho
		lookup.put(":u1f52a:", instance.u1f52a());
		lookup.put(":hocho:", instance.u1f52a());
		lookup.put(":knife:", instance.u1f52a());
		// pill
		lookup.put(":u1f48a:", instance.u1f48a());
		lookup.put(":pill:", instance.u1f48a());
		// syringe
		lookup.put(":u1f489:", instance.u1f489());
		lookup.put(":syringe:", instance.u1f489());
		// money bag
		lookup.put(":u1f4b0:", instance.u1f4b0());
		lookup.put(":moneybag:", instance.u1f4b0());
		// banknote with yen sign
		lookup.put(":u1f4b4:", instance.u1f4b4());
		lookup.put(":yen:", instance.u1f4b4());
		// banknote with dollar sign
		lookup.put(":u1f4b5:", instance.u1f4b5());
		lookup.put(":dollar:", instance.u1f4b5());
		// banknote with pound sign
		lookup.put(":u1f4b7:", instance.u1f4b7());
		lookup.put(":pound:", instance.u1f4b7());
		// banknote with euro sign
		lookup.put(":u1f4b6:", instance.u1f4b6());
		lookup.put(":euro:", instance.u1f4b6());
		// credit card
		lookup.put(":u1f4b3:", instance.u1f4b3());
		lookup.put(":credit_card:", instance.u1f4b3());
		// money with wings
		lookup.put(":u1f4b8:", instance.u1f4b8());
		lookup.put(":money_with_wings:", instance.u1f4b8());
		// mobile phone with rightwards arrow at left
		lookup.put(":u1f4f2:", instance.u1f4f2());
		lookup.put(":calling:", instance.u1f4f2());
		// e-mail symbol
		lookup.put(":u1f4e7:", instance.u1f4e7());
		lookup.put(":e-mail:", instance.u1f4e7());
		// inbox tray
		lookup.put(":u1f4e5:", instance.u1f4e5());
		lookup.put(":inbox_tray:", instance.u1f4e5());
		// outbox tray
		lookup.put(":u1f4e4:", instance.u1f4e4());
		lookup.put(":outbox_tray:", instance.u1f4e4());
		// envelope
		lookup.put(":u2709:", instance.u2709());
		lookup.put(":email:", instance.u2709());
		lookup.put(":envelope:", instance.u2709());
		// envelope with downwards arrow above
		lookup.put(":u1f4e9:", instance.u1f4e9());
		lookup.put(":envelope_with_arrow:", instance.u1f4e9());
		// incoming envelope
		lookup.put(":u1f4e8:", instance.u1f4e8());
		lookup.put(":incoming_envelope:", instance.u1f4e8());
		// postal horn
		lookup.put(":u1f4ef:", instance.u1f4ef());
		lookup.put(":postal_horn:", instance.u1f4ef());
		// closed mailbox with raised flag
		lookup.put(":u1f4eb:", instance.u1f4eb());
		lookup.put(":mailbox:", instance.u1f4eb());
		// closed mailbox with lowered flag
		lookup.put(":u1f4ea:", instance.u1f4ea());
		lookup.put(":mailbox_closed:", instance.u1f4ea());
		// open mailbox with raised flag
		lookup.put(":u1f4ec:", instance.u1f4ec());
		lookup.put(":mailbox_with_mail:", instance.u1f4ec());
		// open mailbox with lowered flag
		lookup.put(":u1f4ed:", instance.u1f4ed());
		lookup.put(":mailbox_with_no_mail:", instance.u1f4ed());
		// postbox
		lookup.put(":u1f4ee:", instance.u1f4ee());
		lookup.put(":postbox:", instance.u1f4ee());
		// package
		lookup.put(":u1f4e6:", instance.u1f4e6());
		lookup.put(":package:", instance.u1f4e6());
		// memo
		lookup.put(":u1f4dd:", instance.u1f4dd());
		lookup.put(":memo:", instance.u1f4dd());
		lookup.put(":pencil:", instance.u1f4dd());
		// page facing up
		lookup.put(":u1f4c4:", instance.u1f4c4());
		lookup.put(":page_facing_up:", instance.u1f4c4());
		// page with curl
		lookup.put(":u1f4c3:", instance.u1f4c3());
		lookup.put(":page_with_curl:", instance.u1f4c3());
		// bookmark tabs
		lookup.put(":u1f4d1:", instance.u1f4d1());
		lookup.put(":bookmark_tabs:", instance.u1f4d1());
		// bar chart
		lookup.put(":u1f4ca:", instance.u1f4ca());
		lookup.put(":bar_chart:", instance.u1f4ca());
		// chart with upwards trend
		lookup.put(":u1f4c8:", instance.u1f4c8());
		lookup.put(":chart_with_upwards_trend:", instance.u1f4c8());
		// chart with downwards trend
		lookup.put(":u1f4c9:", instance.u1f4c9());
		lookup.put(":chart_with_downwards_trend:", instance.u1f4c9());
		// scroll
		lookup.put(":u1f4dc:", instance.u1f4dc());
		lookup.put(":scroll:", instance.u1f4dc());
		// clipboard
		lookup.put(":u1f4cb:", instance.u1f4cb());
		lookup.put(":clipboard:", instance.u1f4cb());
		// calendar
		lookup.put(":u1f4c5:", instance.u1f4c5());
		lookup.put(":date:", instance.u1f4c5());
		// tear-off calendar
		lookup.put(":u1f4c6:", instance.u1f4c6());
		lookup.put(":calendar:", instance.u1f4c6());
		// card index
		lookup.put(":u1f4c7:", instance.u1f4c7());
		lookup.put(":card_index:", instance.u1f4c7());
		// file folder
		lookup.put(":u1f4c1:", instance.u1f4c1());
		lookup.put(":file_folder:", instance.u1f4c1());
		// open file folder
		lookup.put(":u1f4c2:", instance.u1f4c2());
		lookup.put(":open_file_folder:", instance.u1f4c2());
		// black scissors
		lookup.put(":u2702:", instance.u2702());
		lookup.put(":scissors:", instance.u2702());
		// pushpin
		lookup.put(":u1f4cc:", instance.u1f4cc());
		lookup.put(":pushpin:", instance.u1f4cc());
		// paperclip
		lookup.put(":u1f4ce:", instance.u1f4ce());
		lookup.put(":paperclip:", instance.u1f4ce());
		// black nib
		lookup.put(":u2712:", instance.u2712());
		lookup.put(":black_nib:", instance.u2712());
		// pencil
		lookup.put(":u270f:", instance.u270f());
		lookup.put(":pencil2:", instance.u270f());
		// straight ruler
		lookup.put(":u1f4cf:", instance.u1f4cf());
		lookup.put(":straight_ruler:", instance.u1f4cf());
		// triangular ruler
		lookup.put(":u1f4d0:", instance.u1f4d0());
		lookup.put(":triangular_ruler:", instance.u1f4d0());
		// closed book
		lookup.put(":u1f4d5:", instance.u1f4d5());
		lookup.put(":closed_book:", instance.u1f4d5());
		// green book
		lookup.put(":u1f4d7:", instance.u1f4d7());
		lookup.put(":green_book:", instance.u1f4d7());
		// blue book
		lookup.put(":u1f4d8:", instance.u1f4d8());
		lookup.put(":blue_book:", instance.u1f4d8());
		// orange book
		lookup.put(":u1f4d9:", instance.u1f4d9());
		lookup.put(":orange_book:", instance.u1f4d9());
		// notebook
		lookup.put(":u1f4d3:", instance.u1f4d3());
		lookup.put(":notebook:", instance.u1f4d3());
		// notebook with decorative cover
		lookup.put(":u1f4d4:", instance.u1f4d4());
		lookup.put(":notebook_with_decorative_cover:", instance.u1f4d4());
		// ledger
		lookup.put(":u1f4d2:", instance.u1f4d2());
		lookup.put(":ledger:", instance.u1f4d2());
		// books
		lookup.put(":u1f4da:", instance.u1f4da());
		lookup.put(":books:", instance.u1f4da());
		// open book
		lookup.put(":u1f4d6:", instance.u1f4d6());
		lookup.put(":book:", instance.u1f4d6());
		lookup.put(":open_book:", instance.u1f4d6());
		// bookmark
		lookup.put(":u1f516:", instance.u1f516());
		lookup.put(":bookmark:", instance.u1f516());
		// name badge
		lookup.put(":u1f4db:", instance.u1f4db());
		lookup.put(":name_badge:", instance.u1f4db());
		// microscope
		lookup.put(":u1f52c:", instance.u1f52c());
		lookup.put(":microscope:", instance.u1f52c());
		// telescope
		lookup.put(":u1f52d:", instance.u1f52d());
		lookup.put(":telescope:", instance.u1f52d());
		// newspaper
		lookup.put(":u1f4f0:", instance.u1f4f0());
		lookup.put(":newspaper:", instance.u1f4f0());
		// artist palette
		lookup.put(":u1f3a8:", instance.u1f3a8());
		lookup.put(":art:", instance.u1f3a8());
		// clapper board
		lookup.put(":u1f3ac:", instance.u1f3ac());
		lookup.put(":clapper:", instance.u1f3ac());
		// microphone
		lookup.put(":u1f3a4:", instance.u1f3a4());
		lookup.put(":microphone:", instance.u1f3a4());
		// headphone
		lookup.put(":u1f3a7:", instance.u1f3a7());
		lookup.put(":headphones:", instance.u1f3a7());
		// musical score
		lookup.put(":u1f3bc:", instance.u1f3bc());
		lookup.put(":musical_score:", instance.u1f3bc());
		// musical note
		lookup.put(":u1f3b5:", instance.u1f3b5());
		lookup.put(":musical_note:", instance.u1f3b5());
		// multiple musical notes
		lookup.put(":u1f3b6:", instance.u1f3b6());
		lookup.put(":notes:", instance.u1f3b6());
		// musical keyboard
		lookup.put(":u1f3b9:", instance.u1f3b9());
		lookup.put(":musical_keyboard:", instance.u1f3b9());
		// violin
		lookup.put(":u1f3bb:", instance.u1f3bb());
		lookup.put(":violin:", instance.u1f3bb());
		// trumpet
		lookup.put(":u1f3ba:", instance.u1f3ba());
		lookup.put(":trumpet:", instance.u1f3ba());
		// saxophone
		lookup.put(":u1f3b7:", instance.u1f3b7());
		lookup.put(":saxophone:", instance.u1f3b7());
		// guitar
		lookup.put(":u1f3b8:", instance.u1f3b8());
		lookup.put(":guitar:", instance.u1f3b8());
		// alien monster
		lookup.put(":u1f47e:", instance.u1f47e());
		lookup.put(":space_invader:", instance.u1f47e());
		// video game
		lookup.put(":u1f3ae:", instance.u1f3ae());
		lookup.put(":video_game:", instance.u1f3ae());
		// playing card black joker
		lookup.put(":u1f0cf:", instance.u1f0cf());
		lookup.put(":black_joker:", instance.u1f0cf());
		// flower playing cards
		lookup.put(":u1f3b4:", instance.u1f3b4());
		lookup.put(":flower_playing_cards:", instance.u1f3b4());
		// mahjong tile red dragon
		lookup.put(":u1f004:", instance.u1f004());
		lookup.put(":mahjong:", instance.u1f004());
		// game die
		lookup.put(":u1f3b2:", instance.u1f3b2());
		lookup.put(":game_die:", instance.u1f3b2());
		// direct hit
		lookup.put(":u1f3af:", instance.u1f3af());
		lookup.put(":dart:", instance.u1f3af());
		// american football
		lookup.put(":u1f3c8:", instance.u1f3c8());
		lookup.put(":football:", instance.u1f3c8());
		// basketball and hoop
		lookup.put(":u1f3c0:", instance.u1f3c0());
		lookup.put(":basketball:", instance.u1f3c0());
		// soccer ball
		lookup.put(":u26bd:", instance.u26bd());
		lookup.put(":soccer:", instance.u26bd());
		// baseball
		lookup.put(":u26be:", instance.u26be());
		lookup.put(":baseball:", instance.u26be());
		// tennis racquet and ball
		lookup.put(":u1f3be:", instance.u1f3be());
		lookup.put(":tennis:", instance.u1f3be());
		// billiards
		lookup.put(":u1f3b1:", instance.u1f3b1());
		lookup.put(":8ball:", instance.u1f3b1());
		// rugby football
		lookup.put(":u1f3c9:", instance.u1f3c9());
		lookup.put(":rugby_football:", instance.u1f3c9());
		// bowling
		lookup.put(":u1f3b3:", instance.u1f3b3());
		lookup.put(":bowling:", instance.u1f3b3());
		// flag in hole
		lookup.put(":u26f3:", instance.u26f3());
		lookup.put(":golf:", instance.u26f3());
		// mountain bicyclist
		lookup.put(":u1f6b5:", instance.u1f6b5());
		lookup.put(":mountain_bicyclist:", instance.u1f6b5());
		// bicyclist
		lookup.put(":u1f6b4:", instance.u1f6b4());
		lookup.put(":bicyclist:", instance.u1f6b4());
		// chequered flag
		lookup.put(":u1f3c1:", instance.u1f3c1());
		lookup.put(":checkered_flag:", instance.u1f3c1());
		// horse racing
		lookup.put(":u1f3c7:", instance.u1f3c7());
		lookup.put(":horse_racing:", instance.u1f3c7());
		// trophy
		lookup.put(":u1f3c6:", instance.u1f3c6());
		lookup.put(":trophy:", instance.u1f3c6());
		// ski and ski boot
		lookup.put(":u1f3bf:", instance.u1f3bf());
		lookup.put(":ski:", instance.u1f3bf());
		// snowboarder
		lookup.put(":u1f3c2:", instance.u1f3c2());
		lookup.put(":snowboarder:", instance.u1f3c2());
		// swimmer
		lookup.put(":u1f3ca:", instance.u1f3ca());
		lookup.put(":swimmer:", instance.u1f3ca());
		// surfer
		lookup.put(":u1f3c4:", instance.u1f3c4());
		lookup.put(":surfer:", instance.u1f3c4());
		// fishing pole and fish
		lookup.put(":u1f3a3:", instance.u1f3a3());
		lookup.put(":fishing_pole_and_fish:", instance.u1f3a3());
		// hot beverage
		lookup.put(":u2615:", instance.u2615());
		lookup.put(":coffee:", instance.u2615());
		// teacup without handle
		lookup.put(":u1f375:", instance.u1f375());
		lookup.put(":tea:", instance.u1f375());
		// sake bottle and cup
		lookup.put(":u1f376:", instance.u1f376());
		lookup.put(":sake:", instance.u1f376());
		// baby bottle
		lookup.put(":u1f37c:", instance.u1f37c());
		lookup.put(":baby_bottle:", instance.u1f37c());
		// beer mug
		lookup.put(":u1f37a:", instance.u1f37a());
		lookup.put(":beer:", instance.u1f37a());
		// clinking beer mugs
		lookup.put(":u1f37b:", instance.u1f37b());
		lookup.put(":beers:", instance.u1f37b());
		// cocktail glass
		lookup.put(":u1f378:", instance.u1f378());
		lookup.put(":cocktail:", instance.u1f378());
		// tropical drink
		lookup.put(":u1f379:", instance.u1f379());
		lookup.put(":tropical_drink:", instance.u1f379());
		// wine glass
		lookup.put(":u1f377:", instance.u1f377());
		lookup.put(":wine_glass:", instance.u1f377());
		// fork and knife
		lookup.put(":u1f374:", instance.u1f374());
		lookup.put(":fork_and_knife:", instance.u1f374());
		// slice of pizza
		lookup.put(":u1f355:", instance.u1f355());
		lookup.put(":pizza:", instance.u1f355());
		// hamburger
		lookup.put(":u1f354:", instance.u1f354());
		lookup.put(":hamburger:", instance.u1f354());
		// french fries
		lookup.put(":u1f35f:", instance.u1f35f());
		lookup.put(":fries:", instance.u1f35f());
		// poultry leg
		lookup.put(":u1f357:", instance.u1f357());
		lookup.put(":poultry_leg:", instance.u1f357());
		// meat on bone
		lookup.put(":u1f356:", instance.u1f356());
		lookup.put(":meat_on_bone:", instance.u1f356());
		// spaghetti
		lookup.put(":u1f35d:", instance.u1f35d());
		lookup.put(":spaghetti:", instance.u1f35d());
		// curry and rice
		lookup.put(":u1f35b:", instance.u1f35b());
		lookup.put(":curry:", instance.u1f35b());
		// fried shrimp
		lookup.put(":u1f364:", instance.u1f364());
		lookup.put(":fried_shrimp:", instance.u1f364());
		// bento box
		lookup.put(":u1f371:", instance.u1f371());
		lookup.put(":bento:", instance.u1f371());
		// sushi
		lookup.put(":u1f363:", instance.u1f363());
		lookup.put(":sushi:", instance.u1f363());
		// fish cake with swirl design
		lookup.put(":u1f365:", instance.u1f365());
		lookup.put(":fish_cake:", instance.u1f365());
		// rice ball
		lookup.put(":u1f359:", instance.u1f359());
		lookup.put(":rice_ball:", instance.u1f359());
		// rice cracker
		lookup.put(":u1f358:", instance.u1f358());
		lookup.put(":rice_cracker:", instance.u1f358());
		// cooked rice
		lookup.put(":u1f35a:", instance.u1f35a());
		lookup.put(":rice:", instance.u1f35a());
		// steaming bowl
		lookup.put(":u1f35c:", instance.u1f35c());
		lookup.put(":ramen:", instance.u1f35c());
		// pot of food
		lookup.put(":u1f372:", instance.u1f372());
		lookup.put(":stew:", instance.u1f372());
		// oden
		lookup.put(":u1f362:", instance.u1f362());
		lookup.put(":oden:", instance.u1f362());
		// dango
		lookup.put(":u1f361:", instance.u1f361());
		lookup.put(":dango:", instance.u1f361());
		// cooking
		lookup.put(":u1f373:", instance.u1f373());
		lookup.put(":egg:", instance.u1f373());
		// bread
		lookup.put(":u1f35e:", instance.u1f35e());
		lookup.put(":bread:", instance.u1f35e());
		// doughnut
		lookup.put(":u1f369:", instance.u1f369());
		lookup.put(":doughnut:", instance.u1f369());
		// custard
		lookup.put(":u1f36e:", instance.u1f36e());
		lookup.put(":custard:", instance.u1f36e());
		// soft ice cream
		lookup.put(":u1f366:", instance.u1f366());
		lookup.put(":icecream:", instance.u1f366());
		// ice cream
		lookup.put(":u1f368:", instance.u1f368());
		lookup.put(":ice_cream:", instance.u1f368());
		// shaved ice
		lookup.put(":u1f367:", instance.u1f367());
		lookup.put(":shaved_ice:", instance.u1f367());
		// birthday cake
		lookup.put(":u1f382:", instance.u1f382());
		lookup.put(":birthday:", instance.u1f382());
		// shortcake
		lookup.put(":u1f370:", instance.u1f370());
		lookup.put(":cake:", instance.u1f370());
		// cookie
		lookup.put(":u1f36a:", instance.u1f36a());
		lookup.put(":cookie:", instance.u1f36a());
		// chocolate bar
		lookup.put(":u1f36b:", instance.u1f36b());
		lookup.put(":chocolate_bar:", instance.u1f36b());
		// candy
		lookup.put(":u1f36c:", instance.u1f36c());
		lookup.put(":candy:", instance.u1f36c());
		// lollipop
		lookup.put(":u1f36d:", instance.u1f36d());
		lookup.put(":lollipop:", instance.u1f36d());
		// honey pot
		lookup.put(":u1f36f:", instance.u1f36f());
		lookup.put(":honey_pot:", instance.u1f36f());
		// red apple
		lookup.put(":u1f34e:", instance.u1f34e());
		lookup.put(":apple:", instance.u1f34e());
		// green apple
		lookup.put(":u1f34f:", instance.u1f34f());
		lookup.put(":green_apple:", instance.u1f34f());
		// tangerine
		lookup.put(":u1f34a:", instance.u1f34a());
		lookup.put(":tangerine:", instance.u1f34a());
		// lemon
		lookup.put(":u1f34b:", instance.u1f34b());
		lookup.put(":lemon:", instance.u1f34b());
		// cherries
		lookup.put(":u1f352:", instance.u1f352());
		lookup.put(":cherries:", instance.u1f352());
		// grapes
		lookup.put(":u1f347:", instance.u1f347());
		lookup.put(":grapes:", instance.u1f347());
		// watermelon
		lookup.put(":u1f349:", instance.u1f349());
		lookup.put(":watermelon:", instance.u1f349());
		// strawberry
		lookup.put(":u1f353:", instance.u1f353());
		lookup.put(":strawberry:", instance.u1f353());
		// peach
		lookup.put(":u1f351:", instance.u1f351());
		lookup.put(":peach:", instance.u1f351());
		// melon
		lookup.put(":u1f348:", instance.u1f348());
		lookup.put(":melon:", instance.u1f348());
		// banana
		lookup.put(":u1f34c:", instance.u1f34c());
		lookup.put(":banana:", instance.u1f34c());
		// pear
		lookup.put(":u1f350:", instance.u1f350());
		lookup.put(":pear:", instance.u1f350());
		// pineapple
		lookup.put(":u1f34d:", instance.u1f34d());
		lookup.put(":pineapple:", instance.u1f34d());
		// roasted sweet potato
		lookup.put(":u1f360:", instance.u1f360());
		lookup.put(":sweet_potato:", instance.u1f360());
		// aubergine
		lookup.put(":u1f346:", instance.u1f346());
		lookup.put(":eggplant:", instance.u1f346());
		// tomato
		lookup.put(":u1f345:", instance.u1f345());
		lookup.put(":tomato:", instance.u1f345());
		// ear of maize
		lookup.put(":u1f33d:", instance.u1f33d());
		lookup.put(":corn:", instance.u1f33d());
		// house building
		lookup.put(":u1f3e0:", instance.u1f3e0());
		lookup.put(":house:", instance.u1f3e0());
		// house with garden
		lookup.put(":u1f3e1:", instance.u1f3e1());
		lookup.put(":house_with_garden:", instance.u1f3e1());
		// school
		lookup.put(":u1f3eb:", instance.u1f3eb());
		lookup.put(":school:", instance.u1f3eb());
		// office building
		lookup.put(":u1f3e2:", instance.u1f3e2());
		lookup.put(":office:", instance.u1f3e2());
		// japanese post office
		lookup.put(":u1f3e3:", instance.u1f3e3());
		lookup.put(":post_office:", instance.u1f3e3());
		// hospital
		lookup.put(":u1f3e5:", instance.u1f3e5());
		lookup.put(":hospital:", instance.u1f3e5());
		// bank
		lookup.put(":u1f3e6:", instance.u1f3e6());
		lookup.put(":bank:", instance.u1f3e6());
		// convenience store
		lookup.put(":u1f3ea:", instance.u1f3ea());
		lookup.put(":convenience_store:", instance.u1f3ea());
		// love hotel
		lookup.put(":u1f3e9:", instance.u1f3e9());
		lookup.put(":love_hotel:", instance.u1f3e9());
		// hotel
		lookup.put(":u1f3e8:", instance.u1f3e8());
		lookup.put(":hotel:", instance.u1f3e8());
		// wedding
		lookup.put(":u1f492:", instance.u1f492());
		lookup.put(":wedding:", instance.u1f492());
		// church
		lookup.put(":u26ea:", instance.u26ea());
		lookup.put(":church:", instance.u26ea());
		// department store
		lookup.put(":u1f3ec:", instance.u1f3ec());
		lookup.put(":department_store:", instance.u1f3ec());
		// european post office
		lookup.put(":u1f3e4:", instance.u1f3e4());
		lookup.put(":european_post_office:", instance.u1f3e4());
		// sunset over buildings
		lookup.put(":u1f307:", instance.u1f307());
		lookup.put(":city_sunrise:", instance.u1f307());
		// cityscape at dusk
		lookup.put(":u1f306:", instance.u1f306());
		lookup.put(":city_sunset:", instance.u1f306());
		// japanese castle
		lookup.put(":u1f3ef:", instance.u1f3ef());
		lookup.put(":japanese_castle:", instance.u1f3ef());
		// european castle
		lookup.put(":u1f3f0:", instance.u1f3f0());
		lookup.put(":european_castle:", instance.u1f3f0());
		// tent
		lookup.put(":u26fa:", instance.u26fa());
		lookup.put(":tent:", instance.u26fa());
		// factory
		lookup.put(":u1f3ed:", instance.u1f3ed());
		lookup.put(":factory:", instance.u1f3ed());
		// tokyo tower
		lookup.put(":u1f5fc:", instance.u1f5fc());
		lookup.put(":tokyo_tower:", instance.u1f5fc());
		// silhouette of japan
		lookup.put(":u1f5fe:", instance.u1f5fe());
		lookup.put(":japan:", instance.u1f5fe());
		// mount fuji
		lookup.put(":u1f5fb:", instance.u1f5fb());
		lookup.put(":mount_fuji:", instance.u1f5fb());
		// sunrise over mountains
		lookup.put(":u1f304:", instance.u1f304());
		lookup.put(":sunrise_over_mountains:", instance.u1f304());
		// sunrise
		lookup.put(":u1f305:", instance.u1f305());
		lookup.put(":sunrise:", instance.u1f305());
		// night with stars
		lookup.put(":u1f303:", instance.u1f303());
		lookup.put(":night_with_stars:", instance.u1f303());
		// statue of liberty
		lookup.put(":u1f5fd:", instance.u1f5fd());
		lookup.put(":statue_of_liberty:", instance.u1f5fd());
		// bridge at night
		lookup.put(":u1f309:", instance.u1f309());
		lookup.put(":bridge_at_night:", instance.u1f309());
		// carousel horse
		lookup.put(":u1f3a0:", instance.u1f3a0());
		lookup.put(":carousel_horse:", instance.u1f3a0());
		// ferris wheel
		lookup.put(":u1f3a1:", instance.u1f3a1());
		lookup.put(":ferris_wheel:", instance.u1f3a1());
		// fountain
		lookup.put(":u26f2:", instance.u26f2());
		lookup.put(":fountain:", instance.u26f2());
		// roller coaster
		lookup.put(":u1f3a2:", instance.u1f3a2());
		lookup.put(":roller_coaster:", instance.u1f3a2());
		// ship
		lookup.put(":u1f6a2:", instance.u1f6a2());
		lookup.put(":ship:", instance.u1f6a2());
		// sailboat
		lookup.put(":u26f5:", instance.u26f5());
		lookup.put(":boat:", instance.u26f5());
		lookup.put(":sailboat:", instance.u26f5());
		// speedboat
		lookup.put(":u1f6a4:", instance.u1f6a4());
		lookup.put(":speedboat:", instance.u1f6a4());
		// rowboat
		lookup.put(":u1f6a3:", instance.u1f6a3());
		lookup.put(":rowboat:", instance.u1f6a3());
		// anchor
		lookup.put(":u2693:", instance.u2693());
		lookup.put(":anchor:", instance.u2693());
		// rocket
		lookup.put(":u1f680:", instance.u1f680());
		lookup.put(":rocket:", instance.u1f680());
		// airplane
		lookup.put(":u2708:", instance.u2708());
		lookup.put(":airplane:", instance.u2708());
		// seat
		lookup.put(":u1f4ba:", instance.u1f4ba());
		lookup.put(":seat:", instance.u1f4ba());
		// helicopter
		lookup.put(":u1f681:", instance.u1f681());
		lookup.put(":helicopter:", instance.u1f681());
		// steam locomotive
		lookup.put(":u1f682:", instance.u1f682());
		lookup.put(":steam_locomotive:", instance.u1f682());
		// tram
		lookup.put(":u1f68a:", instance.u1f68a());
		lookup.put(":tram:", instance.u1f68a());
		// station
		lookup.put(":u1f689:", instance.u1f689());
		lookup.put(":station:", instance.u1f689());
		// mountain railway
		lookup.put(":u1f69e:", instance.u1f69e());
		lookup.put(":mountain_railway:", instance.u1f69e());
		// train
		lookup.put(":u1f686:", instance.u1f686());
		lookup.put(":train2:", instance.u1f686());
		// high-speed train
		lookup.put(":u1f684:", instance.u1f684());
		lookup.put(":bullettrain_side:", instance.u1f684());
		// high-speed train with bullet nose
		lookup.put(":u1f685:", instance.u1f685());
		lookup.put(":bullettrain_front:", instance.u1f685());
		// light rail
		lookup.put(":u1f688:", instance.u1f688());
		lookup.put(":light_rail:", instance.u1f688());
		// metro
		lookup.put(":u1f687:", instance.u1f687());
		lookup.put(":metro:", instance.u1f687());
		// monorail
		lookup.put(":u1f69d:", instance.u1f69d());
		lookup.put(":monorail:", instance.u1f69d());
		// tram car
		lookup.put(":u1f68b:", instance.u1f68b());
		lookup.put(":train:", instance.u1f68b());
		// railway car
		lookup.put(":u1f683:", instance.u1f683());
		lookup.put(":railway_car:", instance.u1f683());
		// trolleybus
		lookup.put(":u1f68e:", instance.u1f68e());
		lookup.put(":trolleybus:", instance.u1f68e());
		// bus
		lookup.put(":u1f68c:", instance.u1f68c());
		lookup.put(":bus:", instance.u1f68c());
		// oncoming bus
		lookup.put(":u1f68d:", instance.u1f68d());
		lookup.put(":oncoming_bus:", instance.u1f68d());
		// recreational vehicle
		lookup.put(":u1f699:", instance.u1f699());
		lookup.put(":blue_car:", instance.u1f699());
		// oncoming automobile
		lookup.put(":u1f698:", instance.u1f698());
		lookup.put(":oncoming_automobile:", instance.u1f698());
		// automobile
		lookup.put(":u1f697:", instance.u1f697());
		lookup.put(":car:", instance.u1f697());
		lookup.put(":red_car:", instance.u1f697());
		// taxi
		lookup.put(":u1f695:", instance.u1f695());
		lookup.put(":taxi:", instance.u1f695());
		// oncoming taxi
		lookup.put(":u1f696:", instance.u1f696());
		lookup.put(":oncoming_taxi:", instance.u1f696());
		// articulated lorry
		lookup.put(":u1f69b:", instance.u1f69b());
		lookup.put(":articulated_lorry:", instance.u1f69b());
		// delivery truck
		lookup.put(":u1f69a:", instance.u1f69a());
		lookup.put(":truck:", instance.u1f69a());
		// police cars revolving light
		lookup.put(":u1f6a8:", instance.u1f6a8());
		lookup.put(":rotating_light:", instance.u1f6a8());
		// police car
		lookup.put(":u1f693:", instance.u1f693());
		lookup.put(":police_car:", instance.u1f693());
		// oncoming police car
		lookup.put(":u1f694:", instance.u1f694());
		lookup.put(":oncoming_police_car:", instance.u1f694());
		// fire engine
		lookup.put(":u1f692:", instance.u1f692());
		lookup.put(":fire_engine:", instance.u1f692());
		// ambulance
		lookup.put(":u1f691:", instance.u1f691());
		lookup.put(":ambulance:", instance.u1f691());
		// minibus
		lookup.put(":u1f690:", instance.u1f690());
		lookup.put(":minibus:", instance.u1f690());
		// bicycle
		lookup.put(":u1f6b2:", instance.u1f6b2());
		lookup.put(":bike:", instance.u1f6b2());
		// aerial tramway
		lookup.put(":u1f6a1:", instance.u1f6a1());
		lookup.put(":aerial_tramway:", instance.u1f6a1());
		// suspension railway
		lookup.put(":u1f69f:", instance.u1f69f());
		lookup.put(":suspension_railway:", instance.u1f69f());
		// mountain cableway
		lookup.put(":u1f6a0:", instance.u1f6a0());
		lookup.put(":mountain_cableway:", instance.u1f6a0());
		// tractor
		lookup.put(":u1f69c:", instance.u1f69c());
		lookup.put(":tractor:", instance.u1f69c());
		// barber pole
		lookup.put(":u1f488:", instance.u1f488());
		lookup.put(":barber:", instance.u1f488());
		// bus stop
		lookup.put(":u1f68f:", instance.u1f68f());
		lookup.put(":busstop:", instance.u1f68f());
		// ticket
		lookup.put(":u1f3ab:", instance.u1f3ab());
		lookup.put(":ticket:", instance.u1f3ab());
		// vertical traffic light
		lookup.put(":u1f6a6:", instance.u1f6a6());
		lookup.put(":vertical_traffic_light:", instance.u1f6a6());
		// horizontal traffic light
		lookup.put(":u1f6a5:", instance.u1f6a5());
		lookup.put(":traffic_light:", instance.u1f6a5());
		// warning sign
		lookup.put(":u26a0:", instance.u26a0());
		lookup.put(":warning:", instance.u26a0());
		// construction sign
		lookup.put(":u1f6a7:", instance.u1f6a7());
		lookup.put(":construction:", instance.u1f6a7());
		// japanese symbol for beginner
		lookup.put(":u1f530:", instance.u1f530());
		lookup.put(":beginner:", instance.u1f530());
		// fuel pump
		lookup.put(":u26fd:", instance.u26fd());
		lookup.put(":fuelpump:", instance.u26fd());
		// izakaya lantern
		lookup.put(":u1f3ee:", instance.u1f3ee());
		lookup.put(":izakaya_lantern:", instance.u1f3ee());
		lookup.put(":lantern:", instance.u1f3ee());
		// slot machine
		lookup.put(":u1f3b0:", instance.u1f3b0());
		lookup.put(":slot_machine:", instance.u1f3b0());
		// hot springs
		lookup.put(":u2668:", instance.u2668());
		lookup.put(":hotsprings:", instance.u2668());
		// moyai
		lookup.put(":u1f5ff:", instance.u1f5ff());
		lookup.put(":moyai:", instance.u1f5ff());
		// circus tent
		lookup.put(":u1f3aa:", instance.u1f3aa());
		lookup.put(":circus_tent:", instance.u1f3aa());
		// performing arts
		lookup.put(":u1f3ad:", instance.u1f3ad());
		lookup.put(":performing_arts:", instance.u1f3ad());
		// round pushpin
		lookup.put(":u1f4cd:", instance.u1f4cd());
		lookup.put(":round_pushpin:", instance.u1f4cd());
		// triangular flag on post
		lookup.put(":u1f6a9:", instance.u1f6a9());
		lookup.put(":triangular_flag_on_post:", instance.u1f6a9());
		// regional indicator symbol letter j + regional indicator symbol letter p
		lookup.put(":u1f1ef_1f1f5:", instance.u1f1ef_1f1f5());
		lookup.put(":jp:", instance.u1f1ef_1f1f5());
		// regional indicator symbol letter k + regional indicator symbol letter r
		lookup.put(":u1f1f0_1f1f7:", instance.u1f1f0_1f1f7());
		lookup.put(":kr:", instance.u1f1f0_1f1f7());
		// regional indicator symbol letter d + regional indicator symbol letter e
		lookup.put(":u1f1e9_1f1ea:", instance.u1f1e9_1f1ea());
		lookup.put(":de:", instance.u1f1e9_1f1ea());
		// regional indicator symbol letter c + regional indicator symbol letter n
		lookup.put(":u1f1e8_1f1f3:", instance.u1f1e8_1f1f3());
		lookup.put(":cn:", instance.u1f1e8_1f1f3());
		// regional indicator symbol letter u + regional indicator symbol letter s
		lookup.put(":u1f1fa_1f1f8:", instance.u1f1fa_1f1f8());
		lookup.put(":us:", instance.u1f1fa_1f1f8());
		// regional indicator symbol letter f + regional indicator symbol letter r
		lookup.put(":u1f1eb_1f1f7:", instance.u1f1eb_1f1f7());
		lookup.put(":fr:", instance.u1f1eb_1f1f7());
		// regional indicator symbol letter e + regional indicator symbol letter s
		lookup.put(":u1f1ea_1f1f8:", instance.u1f1ea_1f1f8());
		lookup.put(":es:", instance.u1f1ea_1f1f8());
		// regional indicator symbol letter i + regional indicator symbol letter t
		lookup.put(":u1f1ee_1f1f9:", instance.u1f1ee_1f1f9());
		lookup.put(":it:", instance.u1f1ee_1f1f9());
		// regional indicator symbol letter r + regional indicator symbol letter u
		lookup.put(":u1f1f7_1f1fa:", instance.u1f1f7_1f1fa());
		lookup.put(":ru:", instance.u1f1f7_1f1fa());
		// regional indicator symbol letter g + regional indicator symbol letter b
		lookup.put(":u1f1ec_1f1e7:", instance.u1f1ec_1f1e7());
		lookup.put(":gb:", instance.u1f1ec_1f1e7());
		lookup.put(":uk:", instance.u1f1ec_1f1e7());
		// digit one + combining enclosing keycap
		lookup.put(":u0031_20e3:", instance.u0031_20e3());
		lookup.put(":one:", instance.u0031_20e3());
		// digit two + combining enclosing keycap
		lookup.put(":u0032_20e3:", instance.u0032_20e3());
		lookup.put(":two:", instance.u0032_20e3());
		// digit three + combining enclosing keycap
		lookup.put(":u0033_20e3:", instance.u0033_20e3());
		lookup.put(":three:", instance.u0033_20e3());
		// digit four + combining enclosing keycap
		lookup.put(":u0034_20e3:", instance.u0034_20e3());
		lookup.put(":four:", instance.u0034_20e3());
		// digit five + combining enclosing keycap
		lookup.put(":u0035_20e3:", instance.u0035_20e3());
		lookup.put(":five:", instance.u0035_20e3());
		// digit six + combining enclosing keycap
		lookup.put(":u0036_20e3:", instance.u0036_20e3());
		lookup.put(":six:", instance.u0036_20e3());
		// digit seven + combining enclosing keycap
		lookup.put(":u0037_20e3:", instance.u0037_20e3());
		lookup.put(":seven:", instance.u0037_20e3());
		// digit eight + combining enclosing keycap
		lookup.put(":u0038_20e3:", instance.u0038_20e3());
		lookup.put(":eight:", instance.u0038_20e3());
		// digit nine + combining enclosing keycap
		lookup.put(":u0039_20e3:", instance.u0039_20e3());
		lookup.put(":nine:", instance.u0039_20e3());
		// digit zero + combining enclosing keycap
		lookup.put(":u0030_20e3:", instance.u0030_20e3());
		lookup.put(":zero:", instance.u0030_20e3());
		// keycap ten
		lookup.put(":u1f51f:", instance.u1f51f());
		lookup.put(":keycap_ten:", instance.u1f51f());
		// input symbol for numbers
		lookup.put(":u1f522:", instance.u1f522());
		lookup.put(":1234:", instance.u1f522());
		// number sign + combining enclosing keycap
		lookup.put(":u0023_20e3:", instance.u0023_20e3());
		lookup.put(":hash:", instance.u0023_20e3());
		// input symbol for symbols
		lookup.put(":u1f523:", instance.u1f523());
		lookup.put(":symbols:", instance.u1f523());
		// upwards black arrow
		lookup.put(":u2b06:", instance.u2b06());
		lookup.put(":arrow_up:", instance.u2b06());
		// downwards black arrow
		lookup.put(":u2b07:", instance.u2b07());
		lookup.put(":arrow_down:", instance.u2b07());
		// leftwards black arrow
		lookup.put(":u2b05:", instance.u2b05());
		lookup.put(":arrow_left:", instance.u2b05());
		// black rightwards arrow
		lookup.put(":u27a1:", instance.u27a1());
		lookup.put(":arrow_right:", instance.u27a1());
		// input symbol for latin capital letters
		lookup.put(":u1f520:", instance.u1f520());
		lookup.put(":capital_abcd:", instance.u1f520());
		// input symbol for latin small letters
		lookup.put(":u1f521:", instance.u1f521());
		lookup.put(":abcd:", instance.u1f521());
		// input symbol for latin letters
		lookup.put(":u1f524:", instance.u1f524());
		lookup.put(":abc:", instance.u1f524());
		// north east arrow
		lookup.put(":u2197:", instance.u2197());
		lookup.put(":arrow_upper_right:", instance.u2197());
		// north west arrow
		lookup.put(":u2196:", instance.u2196());
		lookup.put(":arrow_upper_left:", instance.u2196());
		// south east arrow
		lookup.put(":u2198:", instance.u2198());
		lookup.put(":arrow_lower_right:", instance.u2198());
		// south west arrow
		lookup.put(":u2199:", instance.u2199());
		lookup.put(":arrow_lower_left:", instance.u2199());
		// left right arrow
		lookup.put(":u2194:", instance.u2194());
		lookup.put(":left_right_arrow:", instance.u2194());
		// up down arrow
		lookup.put(":u2195:", instance.u2195());
		lookup.put(":arrow_up_down:", instance.u2195());
		// anticlockwise downwards and upwards open circle arrows
		lookup.put(":u1f504:", instance.u1f504());
		lookup.put(":arrows_counterclockwise:", instance.u1f504());
		// black left-pointing triangle
		lookup.put(":u25c0:", instance.u25c0());
		lookup.put(":arrow_backward:", instance.u25c0());
		// black right-pointing triangle
		lookup.put(":u25b6:", instance.u25b6());
		lookup.put(":arrow_forward:", instance.u25b6());
		// up-pointing small red triangle
		lookup.put(":u1f53c:", instance.u1f53c());
		lookup.put(":arrow_up_small:", instance.u1f53c());
		// down-pointing small red triangle
		lookup.put(":u1f53d:", instance.u1f53d());
		lookup.put(":arrow_down_small:", instance.u1f53d());
		// leftwards arrow with hook
		lookup.put(":u21a9:", instance.u21a9());
		lookup.put(":leftwards_arrow_with_hook:", instance.u21a9());
		// rightwards arrow with hook
		lookup.put(":u21aa:", instance.u21aa());
		lookup.put(":arrow_right_hook:", instance.u21aa());
		// information source
		lookup.put(":u2139:", instance.u2139());
		lookup.put(":information_source:", instance.u2139());
		// black left-pointing double triangle
		lookup.put(":u23ea:", instance.u23ea());
		lookup.put(":rewind:", instance.u23ea());
		// black right-pointing double triangle
		lookup.put(":u23e9:", instance.u23e9());
		lookup.put(":fast_forward:", instance.u23e9());
		// black up-pointing double triangle
		lookup.put(":u23eb:", instance.u23eb());
		lookup.put(":arrow_double_up:", instance.u23eb());
		// black down-pointing double triangle
		lookup.put(":u23ec:", instance.u23ec());
		lookup.put(":arrow_double_down:", instance.u23ec());
		// arrow pointing rightwards then curving downwards
		lookup.put(":u2935:", instance.u2935());
		lookup.put(":arrow_heading_down:", instance.u2935());
		// arrow pointing rightwards then curving upwards
		lookup.put(":u2934:", instance.u2934());
		lookup.put(":arrow_heading_up:", instance.u2934());
		// squared ok
		lookup.put(":u1f197:", instance.u1f197());
		lookup.put(":ok:", instance.u1f197());
		// twisted rightwards arrows
		lookup.put(":u1f500:", instance.u1f500());
		lookup.put(":twisted_rightwards_arrows:", instance.u1f500());
		// clockwise rightwards and leftwards open circle arrows
		lookup.put(":u1f501:", instance.u1f501());
		lookup.put(":repeat:", instance.u1f501());
		// clockwise rightwards and leftwards open circle arrows with circled one overlay
		lookup.put(":u1f502:", instance.u1f502());
		lookup.put(":repeat_one:", instance.u1f502());
		// squared new
		lookup.put(":u1f195:", instance.u1f195());
		lookup.put(":new:", instance.u1f195());
		// squared up with exclamation mark
		lookup.put(":u1f199:", instance.u1f199());
		lookup.put(":up:", instance.u1f199());
		// squared cool
		lookup.put(":u1f192:", instance.u1f192());
		lookup.put(":cool:", instance.u1f192());
		// squared free
		lookup.put(":u1f193:", instance.u1f193());
		lookup.put(":free:", instance.u1f193());
		// squared ng
		lookup.put(":u1f196:", instance.u1f196());
		lookup.put(":ng:", instance.u1f196());
		// antenna with bars
		lookup.put(":u1f4f6:", instance.u1f4f6());
		lookup.put(":signal_strength:", instance.u1f4f6());
		// cinema
		lookup.put(":u1f3a6:", instance.u1f3a6());
		lookup.put(":cinema:", instance.u1f3a6());
		// squared katakana koko
		lookup.put(":u1f201:", instance.u1f201());
		lookup.put(":koko:", instance.u1f201());
		// squared cjk unified ideograph-6307
		lookup.put(":u1f22f:", instance.u1f22f());
		lookup.put(":u6307:", instance.u1f22f());
		// squared cjk unified ideograph-7a7a
		lookup.put(":u1f233:", instance.u1f233());
		lookup.put(":u7a7a:", instance.u1f233());
		// squared cjk unified ideograph-6e80
		lookup.put(":u1f235:", instance.u1f235());
		lookup.put(":u6e80:", instance.u1f235());
		// squared cjk unified ideograph-5408
		lookup.put(":u1f234:", instance.u1f234());
		lookup.put(":u5408:", instance.u1f234());
		// squared cjk unified ideograph-7981
		lookup.put(":u1f232:", instance.u1f232());
		lookup.put(":u7981:", instance.u1f232());
		// circled ideograph advantage
		lookup.put(":u1f250:", instance.u1f250());
		lookup.put(":ideograph_advantage:", instance.u1f250());
		// squared cjk unified ideograph-5272
		lookup.put(":u1f239:", instance.u1f239());
		lookup.put(":u5272:", instance.u1f239());
		// squared cjk unified ideograph-55b6
		lookup.put(":u1f23a:", instance.u1f23a());
		lookup.put(":u55b6:", instance.u1f23a());
		// squared cjk unified ideograph-6709
		lookup.put(":u1f236:", instance.u1f236());
		lookup.put(":u6709:", instance.u1f236());
		// squared cjk unified ideograph-7121
		lookup.put(":u1f21a:", instance.u1f21a());
		lookup.put(":u7121:", instance.u1f21a());
		// restroom
		lookup.put(":u1f6bb:", instance.u1f6bb());
		lookup.put(":restroom:", instance.u1f6bb());
		// mens symbol
		lookup.put(":u1f6b9:", instance.u1f6b9());
		lookup.put(":mens:", instance.u1f6b9());
		// womens symbol
		lookup.put(":u1f6ba:", instance.u1f6ba());
		lookup.put(":womens:", instance.u1f6ba());
		// baby symbol
		lookup.put(":u1f6bc:", instance.u1f6bc());
		lookup.put(":baby_symbol:", instance.u1f6bc());
		// water closet
		lookup.put(":u1f6be:", instance.u1f6be());
		lookup.put(":wc:", instance.u1f6be());
		// potable water symbol
		lookup.put(":u1f6b0:", instance.u1f6b0());
		lookup.put(":potable_water:", instance.u1f6b0());
		// put litter in its place symbol
		lookup.put(":u1f6ae:", instance.u1f6ae());
		lookup.put(":put_litter_in_its_place:", instance.u1f6ae());
		// negative squared latin capital letter p
		lookup.put(":u1f17f:", instance.u1f17f());
		lookup.put(":parking:", instance.u1f17f());
		// wheelchair symbol
		lookup.put(":u267f:", instance.u267f());
		lookup.put(":wheelchair:", instance.u267f());
		// no smoking symbol
		lookup.put(":u1f6ad:", instance.u1f6ad());
		lookup.put(":no_smoking:", instance.u1f6ad());
		// squared cjk unified ideograph-6708
		lookup.put(":u1f237:", instance.u1f237());
		lookup.put(":u6708:", instance.u1f237());
		// squared cjk unified ideograph-7533
		lookup.put(":u1f238:", instance.u1f238());
		lookup.put(":u7533:", instance.u1f238());
		// squared katakana sa
		lookup.put(":u1f202:", instance.u1f202());
		lookup.put(":sa:", instance.u1f202());
		// circled latin capital letter m
		lookup.put(":u24c2:", instance.u24c2());
		lookup.put(":m:", instance.u24c2());
		// passport control
		lookup.put(":u1f6c2:", instance.u1f6c2());
		lookup.put(":passport_control:", instance.u1f6c2());
		// baggage claim
		lookup.put(":u1f6c4:", instance.u1f6c4());
		lookup.put(":baggage_claim:", instance.u1f6c4());
		// left luggage
		lookup.put(":u1f6c5:", instance.u1f6c5());
		lookup.put(":left_luggage:", instance.u1f6c5());
		// customs
		lookup.put(":u1f6c3:", instance.u1f6c3());
		lookup.put(":customs:", instance.u1f6c3());
		// circled ideograph accept
		lookup.put(":u1f251:", instance.u1f251());
		lookup.put(":accept:", instance.u1f251());
		// circled ideograph secret
		lookup.put(":u3299:", instance.u3299());
		lookup.put(":secret:", instance.u3299());
		// circled ideograph congratulation
		lookup.put(":u3297:", instance.u3297());
		lookup.put(":congratulations:", instance.u3297());
		// squared cl
		lookup.put(":u1f191:", instance.u1f191());
		lookup.put(":cl:", instance.u1f191());
		// squared sos
		lookup.put(":u1f198:", instance.u1f198());
		lookup.put(":sos:", instance.u1f198());
		// squared id
		lookup.put(":u1f194:", instance.u1f194());
		lookup.put(":id:", instance.u1f194());
		// no entry sign
		lookup.put(":u1f6ab:", instance.u1f6ab());
		lookup.put(":no_entry_sign:", instance.u1f6ab());
		// no one under eighteen symbol
		lookup.put(":u1f51e:", instance.u1f51e());
		lookup.put(":underage:", instance.u1f51e());
		// no mobile phones
		lookup.put(":u1f4f5:", instance.u1f4f5());
		lookup.put(":no_mobile_phones:", instance.u1f4f5());
		// do not litter symbol
		lookup.put(":u1f6af:", instance.u1f6af());
		lookup.put(":do_not_litter:", instance.u1f6af());
		// non-potable water symbol
		lookup.put(":u1f6b1:", instance.u1f6b1());
		lookup.put(":non-potable_water:", instance.u1f6b1());
		// no bicycles
		lookup.put(":u1f6b3:", instance.u1f6b3());
		lookup.put(":no_bicycles:", instance.u1f6b3());
		// no pedestrians
		lookup.put(":u1f6b7:", instance.u1f6b7());
		lookup.put(":no_pedestrians:", instance.u1f6b7());
		// children crossing
		lookup.put(":u1f6b8:", instance.u1f6b8());
		lookup.put(":children_crossing:", instance.u1f6b8());
		// no entry
		lookup.put(":u26d4:", instance.u26d4());
		lookup.put(":no_entry:", instance.u26d4());
		// eight spoked asterisk
		lookup.put(":u2733:", instance.u2733());
		lookup.put(":eight_spoked_asterisk:", instance.u2733());
		// sparkle
		lookup.put(":u2747:", instance.u2747());
		lookup.put(":sparkle:", instance.u2747());
		// negative squared cross mark
		lookup.put(":u274e:", instance.u274e());
		lookup.put(":negative_squared_cross_mark:", instance.u274e());
		// white heavy check mark
		lookup.put(":u2705:", instance.u2705());
		lookup.put(":white_check_mark:", instance.u2705());
		// eight pointed black star
		lookup.put(":u2734:", instance.u2734());
		lookup.put(":eight_pointed_black_star:", instance.u2734());
		// heart decoration
		lookup.put(":u1f49f:", instance.u1f49f());
		lookup.put(":heart_decoration:", instance.u1f49f());
		// squared vs
		lookup.put(":u1f19a:", instance.u1f19a());
		lookup.put(":vs:", instance.u1f19a());
		// vibration mode
		lookup.put(":u1f4f3:", instance.u1f4f3());
		lookup.put(":vibration_mode:", instance.u1f4f3());
		// mobile phone off
		lookup.put(":u1f4f4:", instance.u1f4f4());
		lookup.put(":mobile_phone_off:", instance.u1f4f4());
		// negative squared latin capital letter a
		lookup.put(":u1f170:", instance.u1f170());
		lookup.put(":a:", instance.u1f170());
		// negative squared latin capital letter b
		lookup.put(":u1f171:", instance.u1f171());
		lookup.put(":b:", instance.u1f171());
		// negative squared ab
		lookup.put(":u1f18e:", instance.u1f18e());
		lookup.put(":ab:", instance.u1f18e());
		// negative squared latin capital letter o
		lookup.put(":u1f17e:", instance.u1f17e());
		lookup.put(":o2:", instance.u1f17e());
		// diamond shape with a dot inside
		lookup.put(":u1f4a0:", instance.u1f4a0());
		lookup.put(":diamond_shape_with_a_dot_inside:", instance.u1f4a0());
		// double curly loop
		lookup.put(":u27bf:", instance.u27bf());
		lookup.put(":loop:", instance.u27bf());
		// black universal recycling symbol
		lookup.put(":u267b:", instance.u267b());
		lookup.put(":recycle:", instance.u267b());
		// aries
		lookup.put(":u2648:", instance.u2648());
		lookup.put(":aries:", instance.u2648());
		// taurus
		lookup.put(":u2649:", instance.u2649());
		lookup.put(":taurus:", instance.u2649());
		// gemini
		lookup.put(":u264a:", instance.u264a());
		lookup.put(":gemini:", instance.u264a());
		// cancer
		lookup.put(":u264b:", instance.u264b());
		lookup.put(":cancer:", instance.u264b());
		// leo
		lookup.put(":u264c:", instance.u264c());
		lookup.put(":leo:", instance.u264c());
		// virgo
		lookup.put(":u264d:", instance.u264d());
		lookup.put(":virgo:", instance.u264d());
		// libra
		lookup.put(":u264e:", instance.u264e());
		lookup.put(":libra:", instance.u264e());
		// scorpius
		lookup.put(":u264f:", instance.u264f());
		lookup.put(":scorpius:", instance.u264f());
		// sagittarius
		lookup.put(":u2650:", instance.u2650());
		lookup.put(":sagittarius:", instance.u2650());
		// capricorn
		lookup.put(":u2651:", instance.u2651());
		lookup.put(":capricorn:", instance.u2651());
		// aquarius
		lookup.put(":u2652:", instance.u2652());
		lookup.put(":aquarius:", instance.u2652());
		// pisces
		lookup.put(":u2653:", instance.u2653());
		lookup.put(":pisces:", instance.u2653());
		// ophiuchus
		lookup.put(":u26ce:", instance.u26ce());
		lookup.put(":ophiuchus:", instance.u26ce());
		// six pointed star with middle dot
		lookup.put(":u1f52f:", instance.u1f52f());
		lookup.put(":six_pointed_star:", instance.u1f52f());
		// automated teller machine
		lookup.put(":u1f3e7:", instance.u1f3e7());
		lookup.put(":atm:", instance.u1f3e7());
		// chart with upwards trend and yen sign
		lookup.put(":u1f4b9:", instance.u1f4b9());
		lookup.put(":chart:", instance.u1f4b9());
		// heavy dollar sign
		lookup.put(":u1f4b2:", instance.u1f4b2());
		lookup.put(":heavy_dollar_sign:", instance.u1f4b2());
		// currency exchange
		lookup.put(":u1f4b1:", instance.u1f4b1());
		lookup.put(":currency_exchange:", instance.u1f4b1());
		// copyright sign
		lookup.put(":u00a9:", instance.u00a9());
		lookup.put(":copyright:", instance.u00a9());
		// registered sign
		lookup.put(":u00ae:", instance.u00ae());
		lookup.put(":registered:", instance.u00ae());
		// trade mark sign
		lookup.put(":u2122:", instance.u2122());
		lookup.put(":tm:", instance.u2122());
		// cross mark
		lookup.put(":u274c:", instance.u274c());
		lookup.put(":x:", instance.u274c());
		// double exclamation mark
		lookup.put(":u203c:", instance.u203c());
		lookup.put(":bangbang:", instance.u203c());
		// exclamation question mark
		lookup.put(":u2049:", instance.u2049());
		lookup.put(":interrobang:", instance.u2049());
		// heavy exclamation mark symbol
		lookup.put(":u2757:", instance.u2757());
		lookup.put(":exclamation:", instance.u2757());
		lookup.put(":heavy_exclamation_mark:", instance.u2757());
		// black question mark ornament
		lookup.put(":u2753:", instance.u2753());
		lookup.put(":question:", instance.u2753());
		// white exclamation mark ornament
		lookup.put(":u2755:", instance.u2755());
		lookup.put(":grey_exclamation:", instance.u2755());
		// white question mark ornament
		lookup.put(":u2754:", instance.u2754());
		lookup.put(":grey_question:", instance.u2754());
		// heavy large circle
		lookup.put(":u2b55:", instance.u2b55());
		lookup.put(":o:", instance.u2b55());
		// top with upwards arrow above
		lookup.put(":u1f51d:", instance.u1f51d());
		lookup.put(":top:", instance.u1f51d());
		// end with leftwards arrow above
		lookup.put(":u1f51a:", instance.u1f51a());
		lookup.put(":end:", instance.u1f51a());
		// back with leftwards arrow above
		lookup.put(":u1f519:", instance.u1f519());
		lookup.put(":back:", instance.u1f519());
		// on with exclamation mark with left right arrow above
		lookup.put(":u1f51b:", instance.u1f51b());
		lookup.put(":on:", instance.u1f51b());
		// soon with rightwards arrow above
		lookup.put(":u1f51c:", instance.u1f51c());
		lookup.put(":soon:", instance.u1f51c());
		// clockwise downwards and upwards open circle arrows
		lookup.put(":u1f503:", instance.u1f503());
		lookup.put(":arrows_clockwise:", instance.u1f503());
		// clock face twelve oclock
		lookup.put(":u1f55b:", instance.u1f55b());
		lookup.put(":clock12:", instance.u1f55b());
		// clock face twelve-thirty
		lookup.put(":u1f567:", instance.u1f567());
		lookup.put(":clock1230:", instance.u1f567());
		// clock face one oclock
		lookup.put(":u1f550:", instance.u1f550());
		lookup.put(":clock1:", instance.u1f550());
		// clock face one-thirty
		lookup.put(":u1f55c:", instance.u1f55c());
		lookup.put(":clock130:", instance.u1f55c());
		// clock face two oclock
		lookup.put(":u1f551:", instance.u1f551());
		lookup.put(":clock2:", instance.u1f551());
		// clock face two-thirty
		lookup.put(":u1f55d:", instance.u1f55d());
		lookup.put(":clock230:", instance.u1f55d());
		// clock face three oclock
		lookup.put(":u1f552:", instance.u1f552());
		lookup.put(":clock3:", instance.u1f552());
		// clock face three-thirty
		lookup.put(":u1f55e:", instance.u1f55e());
		lookup.put(":clock330:", instance.u1f55e());
		// clock face four oclock
		lookup.put(":u1f553:", instance.u1f553());
		lookup.put(":clock4:", instance.u1f553());
		// clock face four-thirty
		lookup.put(":u1f55f:", instance.u1f55f());
		lookup.put(":clock430:", instance.u1f55f());
		// clock face five oclock
		lookup.put(":u1f554:", instance.u1f554());
		lookup.put(":clock5:", instance.u1f554());
		// clock face five-thirty
		lookup.put(":u1f560:", instance.u1f560());
		lookup.put(":clock530:", instance.u1f560());
		// clock face six oclock
		lookup.put(":u1f555:", instance.u1f555());
		lookup.put(":clock6:", instance.u1f555());
		// clock face seven oclock
		lookup.put(":u1f556:", instance.u1f556());
		lookup.put(":clock7:", instance.u1f556());
		// clock face eight oclock
		lookup.put(":u1f557:", instance.u1f557());
		lookup.put(":clock8:", instance.u1f557());
		// clock face nine oclock
		lookup.put(":u1f558:", instance.u1f558());
		lookup.put(":clock9:", instance.u1f558());
		// clock face ten oclock
		lookup.put(":u1f559:", instance.u1f559());
		lookup.put(":clock10:", instance.u1f559());
		// clock face eleven oclock
		lookup.put(":u1f55a:", instance.u1f55a());
		lookup.put(":clock11:", instance.u1f55a());
		// clock face six-thirty
		lookup.put(":u1f561:", instance.u1f561());
		lookup.put(":clock630:", instance.u1f561());
		// clock face seven-thirty
		lookup.put(":u1f562:", instance.u1f562());
		lookup.put(":clock730:", instance.u1f562());
		// clock face eight-thirty
		lookup.put(":u1f563:", instance.u1f563());
		lookup.put(":clock830:", instance.u1f563());
		// clock face nine-thirty
		lookup.put(":u1f564:", instance.u1f564());
		lookup.put(":clock930:", instance.u1f564());
		// clock face ten-thirty
		lookup.put(":u1f565:", instance.u1f565());
		lookup.put(":clock1030:", instance.u1f565());
		// clock face eleven-thirty
		lookup.put(":u1f566:", instance.u1f566());
		lookup.put(":clock1130:", instance.u1f566());
		// heavy multiplication x
		lookup.put(":u2716:", instance.u2716());
		lookup.put(":heavy_multiplication_x:", instance.u2716());
		// heavy plus sign
		lookup.put(":u2795:", instance.u2795());
		lookup.put(":heavy_plus_sign:", instance.u2795());
		// heavy minus sign
		lookup.put(":u2796:", instance.u2796());
		lookup.put(":heavy_minus_sign:", instance.u2796());
		// heavy division sign
		lookup.put(":u2797:", instance.u2797());
		lookup.put(":heavy_division_sign:", instance.u2797());
		// black spade suit
		lookup.put(":u2660:", instance.u2660());
		lookup.put(":spades:", instance.u2660());
		// black heart suit
		lookup.put(":u2665:", instance.u2665());
		lookup.put(":hearts:", instance.u2665());
		// black club suit
		lookup.put(":u2663:", instance.u2663());
		lookup.put(":clubs:", instance.u2663());
		// black diamond suit
		lookup.put(":u2666:", instance.u2666());
		lookup.put(":diamonds:", instance.u2666());
		// white flower
		lookup.put(":u1f4ae:", instance.u1f4ae());
		lookup.put(":white_flower:", instance.u1f4ae());
		// hundred points symbol
		lookup.put(":u1f4af:", instance.u1f4af());
		lookup.put(":100:", instance.u1f4af());
		// heavy check mark
		lookup.put(":u2714:", instance.u2714());
		lookup.put(":heavy_check_mark:", instance.u2714());
		// ballot box with check
		lookup.put(":u2611:", instance.u2611());
		lookup.put(":ballot_box_with_check:", instance.u2611());
		// radio button
		lookup.put(":u1f518:", instance.u1f518());
		lookup.put(":radio_button:", instance.u1f518());
		// link symbol
		lookup.put(":u1f517:", instance.u1f517());
		lookup.put(":link:", instance.u1f517());
		// curly loop
		lookup.put(":u27b0:", instance.u27b0());
		lookup.put(":curly_loop:", instance.u27b0());
		// wavy dash
		lookup.put(":u3030:", instance.u3030());
		lookup.put(":wavy_dash:", instance.u3030());
		// part alternation mark
		lookup.put(":u303d:", instance.u303d());
		lookup.put(":part_alternation_mark:", instance.u303d());
		// trident emblem
		lookup.put(":u1f531:", instance.u1f531());
		lookup.put(":trident:", instance.u1f531());
		// black medium square
		lookup.put(":u25fc:", instance.u25fc());
		lookup.put(":black_medium_square:", instance.u25fc());
		// white medium square
		lookup.put(":u25fb:", instance.u25fb());
		lookup.put(":white_medium_square:", instance.u25fb());
		// black medium small square
		lookup.put(":u25fe:", instance.u25fe());
		lookup.put(":black_medium_small_square:", instance.u25fe());
		// white medium small square
		lookup.put(":u25fd:", instance.u25fd());
		lookup.put(":white_medium_small_square:", instance.u25fd());
		// black small square
		lookup.put(":u25aa:", instance.u25aa());
		lookup.put(":black_small_square:", instance.u25aa());
		// white small square
		lookup.put(":u25ab:", instance.u25ab());
		lookup.put(":white_small_square:", instance.u25ab());
		// up-pointing red triangle
		lookup.put(":u1f53a:", instance.u1f53a());
		lookup.put(":small_red_triangle:", instance.u1f53a());
		// black square button
		lookup.put(":u1f532:", instance.u1f532());
		lookup.put(":black_square_button:", instance.u1f532());
		// white square button
		lookup.put(":u1f533:", instance.u1f533());
		lookup.put(":white_square_button:", instance.u1f533());
		// medium black circle
		lookup.put(":u26ab:", instance.u26ab());
		lookup.put(":black_circle:", instance.u26ab());
		// medium white circle
		lookup.put(":u26aa:", instance.u26aa());
		lookup.put(":white_circle:", instance.u26aa());
		// large red circle
		lookup.put(":u1f534:", instance.u1f534());
		lookup.put(":red_circle:", instance.u1f534());
		// large blue circle
		lookup.put(":u1f535:", instance.u1f535());
		lookup.put(":large_blue_circle:", instance.u1f535());
		// down-pointing red triangle
		lookup.put(":u1f53b:", instance.u1f53b());
		lookup.put(":small_red_triangle_down:", instance.u1f53b());
		// white large square
		lookup.put(":u2b1c:", instance.u2b1c());
		lookup.put(":white_large_square:", instance.u2b1c());
		// black large square
		lookup.put(":u2b1b:", instance.u2b1b());
		lookup.put(":black_large_square:", instance.u2b1b());
		// large orange diamond
		lookup.put(":u1f536:", instance.u1f536());
		lookup.put(":large_orange_diamond:", instance.u1f536());
		// large blue diamond
		lookup.put(":u1f537:", instance.u1f537());
		lookup.put(":large_blue_diamond:", instance.u1f537());
		// small orange diamond
		lookup.put(":u1f538:", instance.u1f538());
		lookup.put(":small_orange_diamond:", instance.u1f538());
		// small blue diamond
		lookup.put(":u1f539:", instance.u1f539());
		lookup.put(":small_blue_diamond:", instance.u1f539());
	}

	public ImageResource resource (String name) {
		return lookup.get(name);
	}

	public SafeUri safeUri (String name) {
		ImageResource i = resource(name);

		return i == null ? null : i.getSafeUri();
	}

	public String uri (String name) {
		ImageResource i = resource(name);

		return i == null ? null : i.getSafeUri().asString();
	}

	public boolean isValid (String name) {
		if (name == null) { return false; }

		return resource(name) != null;
	}

	public Set<String> keyWords () {
		return lookup.keySet();
	}

	public Emoji setTheme (Emojis theme) {
		if (instance == null && theme == null) {
			theme = Apple.INSTANCE;
		}

		if (theme != null && theme != instance) {
			instance = theme;

			build();
		}

		return this;
	}
}