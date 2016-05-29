//
//  Emoji.java
//  emoji-gwt
//
//  Created by William Shakour (billy1380) on 15 Nov 2014.
//  Copyright © 2014 WillShex Limited. All rights reserved.
//
package emoji.gwt.emoji;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeUri;

import emoji.gwt.emoji.res.Emojis;
import emoji.gwt.emoji.res.ThemeFactory;

public class Emoji {

	private static Emoji one = null;

	public static interface Ready {
		void ready (Emoji emoji);
	}

	/**
	 * Get Emoji with default theme.
	 * 
	 * @return
	 */
	public static Emoji get () {
		return get(null, null);
	}

	/**
	 * Get Emoji with theme. Swapping between themes will cause a rebuild of the
	 * lookup.
	 * 
	 * @param themeName
	 * @oaram ready
	 * @return
	 */
	public static Emoji get (String themeName, Ready ready) {
		if (one == null) {
			one = new Emoji();
		}

		return one.setTheme(themeName, ready);
	}

	private Emojis instance;
	private String currentThemeName;
	private Collection<String> keywords = null;

	public ImageResource resource (String name) {
		// smiling face with open mouth and smiling eyes
		if (":u1f604:".equals(name)) return instance.u1f604();
		if (":smile:".equals(name)) return instance.u1f604();
		// smiling face with open mouth
		if (":u1f603:".equals(name)) return instance.u1f603();
		if (":smiley:".equals(name)) return instance.u1f603();
		// grinning face
		if (":u1f600:".equals(name)) return instance.u1f600();
		if (":grinning:".equals(name)) return instance.u1f600();
		// smiling face with smiling eyes
		if (":u1f60a:".equals(name)) return instance.u1f60a();
		if (":blush:".equals(name)) return instance.u1f60a();
		// white smiling face
		if (":u263a:".equals(name)) return instance.u263a();
		if (":relaxed:".equals(name)) return instance.u263a();
		// winking face
		if (":u1f609:".equals(name)) return instance.u1f609();
		if (":wink:".equals(name)) return instance.u1f609();
		// smiling face with heart-shaped eyes
		if (":u1f60d:".equals(name)) return instance.u1f60d();
		if (":heart_eyes:".equals(name)) return instance.u1f60d();
		// face throwing a kiss
		if (":u1f618:".equals(name)) return instance.u1f618();
		if (":kissing_heart:".equals(name)) return instance.u1f618();
		// kissing face with closed eyes
		if (":u1f61a:".equals(name)) return instance.u1f61a();
		if (":kissing_closed_eyes:".equals(name)) return instance.u1f61a();
		// kissing face
		if (":u1f617:".equals(name)) return instance.u1f617();
		if (":kissing:".equals(name)) return instance.u1f617();
		// kissing face with smiling eyes
		if (":u1f619:".equals(name)) return instance.u1f619();
		if (":kissing_smiling_eyes:".equals(name)) return instance.u1f619();
		// face with stuck-out tongue and winking eye
		if (":u1f61c:".equals(name)) return instance.u1f61c();
		if (":stuck_out_tongue_winking_eye:".equals(name))
			return instance.u1f61c();
		// face with stuck-out tongue and tightly-closed eyes
		if (":u1f61d:".equals(name)) return instance.u1f61d();
		if (":stuck_out_tongue_closed_eyes:".equals(name))
			return instance.u1f61d();
		// face with stuck-out tongue
		if (":u1f61b:".equals(name)) return instance.u1f61b();
		if (":stuck_out_tongue:".equals(name)) return instance.u1f61b();
		// flushed face
		if (":u1f633:".equals(name)) return instance.u1f633();
		if (":flushed:".equals(name)) return instance.u1f633();
		// grinning face with smiling eyes
		if (":u1f601:".equals(name)) return instance.u1f601();
		if (":grin:".equals(name)) return instance.u1f601();
		// pensive face
		if (":u1f614:".equals(name)) return instance.u1f614();
		if (":pensive:".equals(name)) return instance.u1f614();
		// relieved face
		if (":u1f60c:".equals(name)) return instance.u1f60c();
		if (":relieved:".equals(name)) return instance.u1f60c();
		// unamused face
		if (":u1f612:".equals(name)) return instance.u1f612();
		if (":unamused:".equals(name)) return instance.u1f612();
		// disappointed face
		if (":u1f61e:".equals(name)) return instance.u1f61e();
		if (":disappointed:".equals(name)) return instance.u1f61e();
		// persevering face
		if (":u1f623:".equals(name)) return instance.u1f623();
		if (":persevere:".equals(name)) return instance.u1f623();
		// crying face
		if (":u1f622:".equals(name)) return instance.u1f622();
		if (":cry:".equals(name)) return instance.u1f622();
		// face with tears of joy
		if (":u1f602:".equals(name)) return instance.u1f602();
		if (":joy:".equals(name)) return instance.u1f602();
		// loudly crying face
		if (":u1f62d:".equals(name)) return instance.u1f62d();
		if (":sob:".equals(name)) return instance.u1f62d();
		// sleepy face
		if (":u1f62a:".equals(name)) return instance.u1f62a();
		if (":sleepy:".equals(name)) return instance.u1f62a();
		// disappointed but relieved face
		if (":u1f625:".equals(name)) return instance.u1f625();
		if (":disappointed_relieved:".equals(name)) return instance.u1f625();
		// face with open mouth and cold sweat
		if (":u1f630:".equals(name)) return instance.u1f630();
		if (":cold_sweat:".equals(name)) return instance.u1f630();
		// smiling face with open mouth and cold sweat
		if (":u1f605:".equals(name)) return instance.u1f605();
		if (":sweat_smile:".equals(name)) return instance.u1f605();
		// face with cold sweat
		if (":u1f613:".equals(name)) return instance.u1f613();
		if (":sweat:".equals(name)) return instance.u1f613();
		// weary face
		if (":u1f629:".equals(name)) return instance.u1f629();
		if (":weary:".equals(name)) return instance.u1f629();
		// tired face
		if (":u1f62b:".equals(name)) return instance.u1f62b();
		if (":tired_face:".equals(name)) return instance.u1f62b();
		// fearful face
		if (":u1f628:".equals(name)) return instance.u1f628();
		if (":fearful:".equals(name)) return instance.u1f628();
		// face screaming in fear
		if (":u1f631:".equals(name)) return instance.u1f631();
		if (":scream:".equals(name)) return instance.u1f631();
		// angry face
		if (":u1f620:".equals(name)) return instance.u1f620();
		if (":angry:".equals(name)) return instance.u1f620();
		// pouting face
		if (":u1f621:".equals(name)) return instance.u1f621();
		if (":rage:".equals(name)) return instance.u1f621();
		// face with look of triumph
		if (":u1f624:".equals(name)) return instance.u1f624();
		if (":triumph:".equals(name)) return instance.u1f624();
		// confounded face
		if (":u1f616:".equals(name)) return instance.u1f616();
		if (":confounded:".equals(name)) return instance.u1f616();
		// smiling face with open mouth and tightly-closed eyes
		if (":u1f606:".equals(name)) return instance.u1f606();
		if (":laughing:".equals(name)) return instance.u1f606();
		if (":satisfied:".equals(name)) return instance.u1f606();
		// face savouring delicious food
		if (":u1f60b:".equals(name)) return instance.u1f60b();
		if (":yum:".equals(name)) return instance.u1f60b();
		// face with medical mask
		if (":u1f637:".equals(name)) return instance.u1f637();
		if (":mask:".equals(name)) return instance.u1f637();
		// smiling face with sunglasses
		if (":u1f60e:".equals(name)) return instance.u1f60e();
		if (":sunglasses:".equals(name)) return instance.u1f60e();
		// sleeping face
		if (":u1f634:".equals(name)) return instance.u1f634();
		if (":sleeping:".equals(name)) return instance.u1f634();
		// dizzy face
		if (":u1f635:".equals(name)) return instance.u1f635();
		if (":dizzy_face:".equals(name)) return instance.u1f635();
		// astonished face
		if (":u1f632:".equals(name)) return instance.u1f632();
		if (":astonished:".equals(name)) return instance.u1f632();
		// worried face
		if (":u1f61f:".equals(name)) return instance.u1f61f();
		if (":worried:".equals(name)) return instance.u1f61f();
		// frowning face with open mouth
		if (":u1f626:".equals(name)) return instance.u1f626();
		if (":frowning:".equals(name)) return instance.u1f626();
		// anguished face
		if (":u1f627:".equals(name)) return instance.u1f627();
		if (":anguished:".equals(name)) return instance.u1f627();
		// smiling face with horns
		if (":u1f608:".equals(name)) return instance.u1f608();
		if (":smiling_imp:".equals(name)) return instance.u1f608();
		// imp
		if (":u1f47f:".equals(name)) return instance.u1f47f();
		if (":imp:".equals(name)) return instance.u1f47f();
		// face with open mouth
		if (":u1f62e:".equals(name)) return instance.u1f62e();
		if (":open_mouth:".equals(name)) return instance.u1f62e();
		// grimacing face
		if (":u1f62c:".equals(name)) return instance.u1f62c();
		if (":grimacing:".equals(name)) return instance.u1f62c();
		// neutral face
		if (":u1f610:".equals(name)) return instance.u1f610();
		if (":neutral_face:".equals(name)) return instance.u1f610();
		// confused face
		if (":u1f615:".equals(name)) return instance.u1f615();
		if (":confused:".equals(name)) return instance.u1f615();
		// hushed face
		if (":u1f62f:".equals(name)) return instance.u1f62f();
		if (":hushed:".equals(name)) return instance.u1f62f();
		// face without mouth
		if (":u1f636:".equals(name)) return instance.u1f636();
		if (":no_mouth:".equals(name)) return instance.u1f636();
		// smiling face with halo
		if (":u1f607:".equals(name)) return instance.u1f607();
		if (":innocent:".equals(name)) return instance.u1f607();
		// smirking face
		if (":u1f60f:".equals(name)) return instance.u1f60f();
		if (":smirk:".equals(name)) return instance.u1f60f();
		// expressionless face
		if (":u1f611:".equals(name)) return instance.u1f611();
		if (":expressionless:".equals(name)) return instance.u1f611();
		// man with gua pi mao
		if (":u1f472:".equals(name)) return instance.u1f472();
		if (":man_with_gua_pi_mao:".equals(name)) return instance.u1f472();
		// man with turban
		if (":u1f473:".equals(name)) return instance.u1f473();
		if (":man_with_turban:".equals(name)) return instance.u1f473();
		// police officer
		if (":u1f46e:".equals(name)) return instance.u1f46e();
		if (":cop:".equals(name)) return instance.u1f46e();
		// construction worker
		if (":u1f477:".equals(name)) return instance.u1f477();
		if (":construction_worker:".equals(name)) return instance.u1f477();
		// guardsman
		if (":u1f482:".equals(name)) return instance.u1f482();
		if (":guardsman:".equals(name)) return instance.u1f482();
		// baby
		if (":u1f476:".equals(name)) return instance.u1f476();
		if (":baby:".equals(name)) return instance.u1f476();
		// boy
		if (":u1f466:".equals(name)) return instance.u1f466();
		if (":boy:".equals(name)) return instance.u1f466();
		// girl
		if (":u1f467:".equals(name)) return instance.u1f467();
		if (":girl:".equals(name)) return instance.u1f467();
		// man
		if (":u1f468:".equals(name)) return instance.u1f468();
		if (":man:".equals(name)) return instance.u1f468();
		// woman
		if (":u1f469:".equals(name)) return instance.u1f469();
		if (":woman:".equals(name)) return instance.u1f469();
		// older man
		if (":u1f474:".equals(name)) return instance.u1f474();
		if (":older_man:".equals(name)) return instance.u1f474();
		// older woman
		if (":u1f475:".equals(name)) return instance.u1f475();
		if (":older_woman:".equals(name)) return instance.u1f475();
		// person with blond hair
		if (":u1f471:".equals(name)) return instance.u1f471();
		if (":person_with_blond_hair:".equals(name)) return instance.u1f471();
		// baby angel
		if (":u1f47c:".equals(name)) return instance.u1f47c();
		if (":angel:".equals(name)) return instance.u1f47c();
		// princess
		if (":u1f478:".equals(name)) return instance.u1f478();
		if (":princess:".equals(name)) return instance.u1f478();
		// smiling cat face with open mouth
		if (":u1f63a:".equals(name)) return instance.u1f63a();
		if (":smiley_cat:".equals(name)) return instance.u1f63a();
		// grinning cat face with smiling eyes
		if (":u1f638:".equals(name)) return instance.u1f638();
		if (":smile_cat:".equals(name)) return instance.u1f638();
		// smiling cat face with heart-shaped eyes
		if (":u1f63b:".equals(name)) return instance.u1f63b();
		if (":heart_eyes_cat:".equals(name)) return instance.u1f63b();
		// kissing cat face with closed eyes
		if (":u1f63d:".equals(name)) return instance.u1f63d();
		if (":kissing_cat:".equals(name)) return instance.u1f63d();
		// cat face with wry smile
		if (":u1f63c:".equals(name)) return instance.u1f63c();
		if (":smirk_cat:".equals(name)) return instance.u1f63c();
		// weary cat face
		if (":u1f640:".equals(name)) return instance.u1f640();
		if (":scream_cat:".equals(name)) return instance.u1f640();
		// crying cat face
		if (":u1f63f:".equals(name)) return instance.u1f63f();
		if (":crying_cat_face:".equals(name)) return instance.u1f63f();
		// cat face with tears of joy
		if (":u1f639:".equals(name)) return instance.u1f639();
		if (":joy_cat:".equals(name)) return instance.u1f639();
		// pouting cat face
		if (":u1f63e:".equals(name)) return instance.u1f63e();
		if (":pouting_cat:".equals(name)) return instance.u1f63e();
		// japanese ogre
		if (":u1f479:".equals(name)) return instance.u1f479();
		if (":japanese_ogre:".equals(name)) return instance.u1f479();
		// japanese goblin
		if (":u1f47a:".equals(name)) return instance.u1f47a();
		if (":japanese_goblin:".equals(name)) return instance.u1f47a();
		// see-no-evil monkey
		if (":u1f648:".equals(name)) return instance.u1f648();
		if (":see_no_evil:".equals(name)) return instance.u1f648();
		// hear-no-evil monkey
		if (":u1f649:".equals(name)) return instance.u1f649();
		if (":hear_no_evil:".equals(name)) return instance.u1f649();
		// speak-no-evil monkey
		if (":u1f64a:".equals(name)) return instance.u1f64a();
		if (":speak_no_evil:".equals(name)) return instance.u1f64a();
		// skull
		if (":u1f480:".equals(name)) return instance.u1f480();
		if (":skull:".equals(name)) return instance.u1f480();
		// extraterrestrial alien
		if (":u1f47d:".equals(name)) return instance.u1f47d();
		if (":alien:".equals(name)) return instance.u1f47d();
		// pile of poo
		if (":u1f4a9:".equals(name)) return instance.u1f4a9();
		if (":hankey:".equals(name)) return instance.u1f4a9();
		if (":poop:".equals(name)) return instance.u1f4a9();
		if (":shit:".equals(name)) return instance.u1f4a9();
		// fire
		if (":u1f525:".equals(name)) return instance.u1f525();
		if (":fire:".equals(name)) return instance.u1f525();
		// sparkles
		if (":u2728:".equals(name)) return instance.u2728();
		if (":sparkles:".equals(name)) return instance.u2728();
		// glowing star
		if (":u1f31f:".equals(name)) return instance.u1f31f();
		if (":star2:".equals(name)) return instance.u1f31f();
		// dizzy symbol
		if (":u1f4ab:".equals(name)) return instance.u1f4ab();
		if (":dizzy:".equals(name)) return instance.u1f4ab();
		// collision symbol
		if (":u1f4a5:".equals(name)) return instance.u1f4a5();
		if (":boom:".equals(name)) return instance.u1f4a5();
		if (":collision:".equals(name)) return instance.u1f4a5();
		// anger symbol
		if (":u1f4a2:".equals(name)) return instance.u1f4a2();
		if (":anger:".equals(name)) return instance.u1f4a2();
		// splashing sweat symbol
		if (":u1f4a6:".equals(name)) return instance.u1f4a6();
		if (":sweat_drops:".equals(name)) return instance.u1f4a6();
		// droplet
		if (":u1f4a7:".equals(name)) return instance.u1f4a7();
		if (":droplet:".equals(name)) return instance.u1f4a7();
		// sleeping symbol
		if (":u1f4a4:".equals(name)) return instance.u1f4a4();
		if (":zzz:".equals(name)) return instance.u1f4a4();
		// dash symbol
		if (":u1f4a8:".equals(name)) return instance.u1f4a8();
		if (":dash:".equals(name)) return instance.u1f4a8();
		// ear
		if (":u1f442:".equals(name)) return instance.u1f442();
		if (":ear:".equals(name)) return instance.u1f442();
		// eyes
		if (":u1f440:".equals(name)) return instance.u1f440();
		if (":eyes:".equals(name)) return instance.u1f440();
		// nose
		if (":u1f443:".equals(name)) return instance.u1f443();
		if (":nose:".equals(name)) return instance.u1f443();
		// tongue
		if (":u1f445:".equals(name)) return instance.u1f445();
		if (":tongue:".equals(name)) return instance.u1f445();
		// mouth
		if (":u1f444:".equals(name)) return instance.u1f444();
		if (":lips:".equals(name)) return instance.u1f444();
		// thumbs up sign
		if (":u1f44d:".equals(name)) return instance.u1f44d();
		if (":+1:".equals(name)) return instance.u1f44d();
		if (":thumbsup:".equals(name)) return instance.u1f44d();
		// thumbs down sign
		if (":u1f44e:".equals(name)) return instance.u1f44e();
		if (":-1:".equals(name)) return instance.u1f44e();
		if (":thumbsdown:".equals(name)) return instance.u1f44e();
		// ok hand sign
		if (":u1f44c:".equals(name)) return instance.u1f44c();
		if (":ok_hand:".equals(name)) return instance.u1f44c();
		// fisted hand sign
		if (":u1f44a:".equals(name)) return instance.u1f44a();
		if (":facepunch:".equals(name)) return instance.u1f44a();
		if (":punch:".equals(name)) return instance.u1f44a();
		// raised fist
		if (":u270a:".equals(name)) return instance.u270a();
		if (":fist:".equals(name)) return instance.u270a();
		// victory hand
		if (":u270c:".equals(name)) return instance.u270c();
		if (":v:".equals(name)) return instance.u270c();
		// waving hand sign
		if (":u1f44b:".equals(name)) return instance.u1f44b();
		if (":wave:".equals(name)) return instance.u1f44b();
		// raised hand
		if (":u270b:".equals(name)) return instance.u270b();
		if (":hand:".equals(name)) return instance.u270b();
		if (":raised_hand:".equals(name)) return instance.u270b();
		// open hands sign
		if (":u1f450:".equals(name)) return instance.u1f450();
		if (":open_hands:".equals(name)) return instance.u1f450();
		// white up pointing backhand index
		if (":u1f446:".equals(name)) return instance.u1f446();
		if (":point_up_2:".equals(name)) return instance.u1f446();
		// white down pointing backhand index
		if (":u1f447:".equals(name)) return instance.u1f447();
		if (":point_down:".equals(name)) return instance.u1f447();
		// white right pointing backhand index
		if (":u1f449:".equals(name)) return instance.u1f449();
		if (":point_right:".equals(name)) return instance.u1f449();
		// white left pointing backhand index
		if (":u1f448:".equals(name)) return instance.u1f448();
		if (":point_left:".equals(name)) return instance.u1f448();
		// person raising both hands in celebration
		if (":u1f64c:".equals(name)) return instance.u1f64c();
		if (":raised_hands:".equals(name)) return instance.u1f64c();
		// person with folded hands
		if (":u1f64f:".equals(name)) return instance.u1f64f();
		if (":pray:".equals(name)) return instance.u1f64f();
		// white up pointing index
		if (":u261d:".equals(name)) return instance.u261d();
		if (":point_up:".equals(name)) return instance.u261d();
		// clapping hands sign
		if (":u1f44f:".equals(name)) return instance.u1f44f();
		if (":clap:".equals(name)) return instance.u1f44f();
		// flexed biceps
		if (":u1f4aa:".equals(name)) return instance.u1f4aa();
		if (":muscle:".equals(name)) return instance.u1f4aa();
		// pedestrian
		if (":u1f6b6:".equals(name)) return instance.u1f6b6();
		if (":walking:".equals(name)) return instance.u1f6b6();
		// runner
		if (":u1f3c3:".equals(name)) return instance.u1f3c3();
		if (":runner:".equals(name)) return instance.u1f3c3();
		if (":running:".equals(name)) return instance.u1f3c3();
		// dancer
		if (":u1f483:".equals(name)) return instance.u1f483();
		if (":dancer:".equals(name)) return instance.u1f483();
		// man and woman holding hands
		if (":u1f46b:".equals(name)) return instance.u1f46b();
		if (":couple:".equals(name)) return instance.u1f46b();
		// family
		if (":u1f46a:".equals(name)) return instance.u1f46a();
		if (":family:".equals(name)) return instance.u1f46a();
		// two men holding hands
		if (":u1f46c:".equals(name)) return instance.u1f46c();
		if (":two_men_holding_hands:".equals(name)) return instance.u1f46c();
		// two women holding hands
		if (":u1f46d:".equals(name)) return instance.u1f46d();
		if (":two_women_holding_hands:".equals(name)) return instance.u1f46d();
		// kiss
		if (":u1f48f:".equals(name)) return instance.u1f48f();
		if (":couplekiss:".equals(name)) return instance.u1f48f();
		// couple with heart
		if (":u1f491:".equals(name)) return instance.u1f491();
		if (":couple_with_heart:".equals(name)) return instance.u1f491();
		// woman with bunny ears
		if (":u1f46f:".equals(name)) return instance.u1f46f();
		if (":dancers:".equals(name)) return instance.u1f46f();
		// face with ok gesture
		if (":u1f646:".equals(name)) return instance.u1f646();
		if (":ok_woman:".equals(name)) return instance.u1f646();
		// face with no good gesture
		if (":u1f645:".equals(name)) return instance.u1f645();
		if (":no_good:".equals(name)) return instance.u1f645();
		// information desk person
		if (":u1f481:".equals(name)) return instance.u1f481();
		if (":information_desk_person:".equals(name)) return instance.u1f481();
		// happy person raising one hand
		if (":u1f64b:".equals(name)) return instance.u1f64b();
		if (":raising_hand:".equals(name)) return instance.u1f64b();
		// face massage
		if (":u1f486:".equals(name)) return instance.u1f486();
		if (":massage:".equals(name)) return instance.u1f486();
		// haircut
		if (":u1f487:".equals(name)) return instance.u1f487();
		if (":haircut:".equals(name)) return instance.u1f487();
		// nail polish
		if (":u1f485:".equals(name)) return instance.u1f485();
		if (":nail_care:".equals(name)) return instance.u1f485();
		// bride with veil
		if (":u1f470:".equals(name)) return instance.u1f470();
		if (":bride_with_veil:".equals(name)) return instance.u1f470();
		// person with pouting face
		if (":u1f64e:".equals(name)) return instance.u1f64e();
		if (":person_with_pouting_face:".equals(name)) return instance.u1f64e();
		// person frowning
		if (":u1f64d:".equals(name)) return instance.u1f64d();
		if (":person_frowning:".equals(name)) return instance.u1f64d();
		// person bowing deeply
		if (":u1f647:".equals(name)) return instance.u1f647();
		if (":bow:".equals(name)) return instance.u1f647();
		// top hat
		if (":u1f3a9:".equals(name)) return instance.u1f3a9();
		if (":tophat:".equals(name)) return instance.u1f3a9();
		// crown
		if (":u1f451:".equals(name)) return instance.u1f451();
		if (":crown:".equals(name)) return instance.u1f451();
		// womans hat
		if (":u1f452:".equals(name)) return instance.u1f452();
		if (":womans_hat:".equals(name)) return instance.u1f452();
		// athletic shoe
		if (":u1f45f:".equals(name)) return instance.u1f45f();
		if (":athletic_shoe:".equals(name)) return instance.u1f45f();
		// mans shoe
		if (":u1f45e:".equals(name)) return instance.u1f45e();
		if (":mans_shoe:".equals(name)) return instance.u1f45e();
		if (":shoe:".equals(name)) return instance.u1f45e();
		// womans sandal
		if (":u1f461:".equals(name)) return instance.u1f461();
		if (":sandal:".equals(name)) return instance.u1f461();
		// high-heeled shoe
		if (":u1f460:".equals(name)) return instance.u1f460();
		if (":high_heel:".equals(name)) return instance.u1f460();
		// womans boots
		if (":u1f462:".equals(name)) return instance.u1f462();
		if (":boot:".equals(name)) return instance.u1f462();
		// t-shirt
		if (":u1f455:".equals(name)) return instance.u1f455();
		if (":shirt:".equals(name)) return instance.u1f455();
		if (":tshirt:".equals(name)) return instance.u1f455();
		// necktie
		if (":u1f454:".equals(name)) return instance.u1f454();
		if (":necktie:".equals(name)) return instance.u1f454();
		// womans clothes
		if (":u1f45a:".equals(name)) return instance.u1f45a();
		if (":womans_clothes:".equals(name)) return instance.u1f45a();
		// dress
		if (":u1f457:".equals(name)) return instance.u1f457();
		if (":dress:".equals(name)) return instance.u1f457();
		// running shirt with sash
		if (":u1f3bd:".equals(name)) return instance.u1f3bd();
		if (":running_shirt_with_sash:".equals(name)) return instance.u1f3bd();
		// jeans
		if (":u1f456:".equals(name)) return instance.u1f456();
		if (":jeans:".equals(name)) return instance.u1f456();
		// kimono
		if (":u1f458:".equals(name)) return instance.u1f458();
		if (":kimono:".equals(name)) return instance.u1f458();
		// bikini
		if (":u1f459:".equals(name)) return instance.u1f459();
		if (":bikini:".equals(name)) return instance.u1f459();
		// briefcase
		if (":u1f4bc:".equals(name)) return instance.u1f4bc();
		if (":briefcase:".equals(name)) return instance.u1f4bc();
		// handbag
		if (":u1f45c:".equals(name)) return instance.u1f45c();
		if (":handbag:".equals(name)) return instance.u1f45c();
		// pouch
		if (":u1f45d:".equals(name)) return instance.u1f45d();
		if (":pouch:".equals(name)) return instance.u1f45d();
		// purse
		if (":u1f45b:".equals(name)) return instance.u1f45b();
		if (":purse:".equals(name)) return instance.u1f45b();
		// eyeglasses
		if (":u1f453:".equals(name)) return instance.u1f453();
		if (":eyeglasses:".equals(name)) return instance.u1f453();
		// ribbon
		if (":u1f380:".equals(name)) return instance.u1f380();
		if (":ribbon:".equals(name)) return instance.u1f380();
		// closed umbrella
		if (":u1f302:".equals(name)) return instance.u1f302();
		if (":closed_umbrella:".equals(name)) return instance.u1f302();
		// lipstick
		if (":u1f484:".equals(name)) return instance.u1f484();
		if (":lipstick:".equals(name)) return instance.u1f484();
		// yellow heart
		if (":u1f49b:".equals(name)) return instance.u1f49b();
		if (":yellow_heart:".equals(name)) return instance.u1f49b();
		// blue heart
		if (":u1f499:".equals(name)) return instance.u1f499();
		if (":blue_heart:".equals(name)) return instance.u1f499();
		// purple heart
		if (":u1f49c:".equals(name)) return instance.u1f49c();
		if (":purple_heart:".equals(name)) return instance.u1f49c();
		// green heart
		if (":u1f49a:".equals(name)) return instance.u1f49a();
		if (":green_heart:".equals(name)) return instance.u1f49a();
		// heavy black heart
		if (":u2764:".equals(name)) return instance.u2764();
		if (":heart:".equals(name)) return instance.u2764();
		// broken heart
		if (":u1f494:".equals(name)) return instance.u1f494();
		if (":broken_heart:".equals(name)) return instance.u1f494();
		// growing heart
		if (":u1f497:".equals(name)) return instance.u1f497();
		if (":heartpulse:".equals(name)) return instance.u1f497();
		// beating heart
		if (":u1f493:".equals(name)) return instance.u1f493();
		if (":heartbeat:".equals(name)) return instance.u1f493();
		// two hearts
		if (":u1f495:".equals(name)) return instance.u1f495();
		if (":two_hearts:".equals(name)) return instance.u1f495();
		// sparkling heart
		if (":u1f496:".equals(name)) return instance.u1f496();
		if (":sparkling_heart:".equals(name)) return instance.u1f496();
		// revolving hearts
		if (":u1f49e:".equals(name)) return instance.u1f49e();
		if (":revolving_hearts:".equals(name)) return instance.u1f49e();
		// heart with arrow
		if (":u1f498:".equals(name)) return instance.u1f498();
		if (":cupid:".equals(name)) return instance.u1f498();
		// love letter
		if (":u1f48c:".equals(name)) return instance.u1f48c();
		if (":love_letter:".equals(name)) return instance.u1f48c();
		// kiss mark
		if (":u1f48b:".equals(name)) return instance.u1f48b();
		if (":kiss:".equals(name)) return instance.u1f48b();
		// ring
		if (":u1f48d:".equals(name)) return instance.u1f48d();
		if (":ring:".equals(name)) return instance.u1f48d();
		// gem stone
		if (":u1f48e:".equals(name)) return instance.u1f48e();
		if (":gem:".equals(name)) return instance.u1f48e();
		// bust in silhouette
		if (":u1f464:".equals(name)) return instance.u1f464();
		if (":bust_in_silhouette:".equals(name)) return instance.u1f464();
		// busts in silhouette
		if (":u1f465:".equals(name)) return instance.u1f465();
		if (":busts_in_silhouette:".equals(name)) return instance.u1f465();
		// speech balloon
		if (":u1f4ac:".equals(name)) return instance.u1f4ac();
		if (":speech_balloon:".equals(name)) return instance.u1f4ac();
		// footprints
		if (":u1f463:".equals(name)) return instance.u1f463();
		if (":footprints:".equals(name)) return instance.u1f463();
		// thought balloon
		if (":u1f4ad:".equals(name)) return instance.u1f4ad();
		if (":thought_balloon:".equals(name)) return instance.u1f4ad();
		// dog face
		if (":u1f436:".equals(name)) return instance.u1f436();
		if (":dog:".equals(name)) return instance.u1f436();
		// wolf face
		if (":u1f43a:".equals(name)) return instance.u1f43a();
		if (":wolf:".equals(name)) return instance.u1f43a();
		// cat face
		if (":u1f431:".equals(name)) return instance.u1f431();
		if (":cat:".equals(name)) return instance.u1f431();
		// mouse face
		if (":u1f42d:".equals(name)) return instance.u1f42d();
		if (":mouse:".equals(name)) return instance.u1f42d();
		// hamster face
		if (":u1f439:".equals(name)) return instance.u1f439();
		if (":hamster:".equals(name)) return instance.u1f439();
		// rabbit face
		if (":u1f430:".equals(name)) return instance.u1f430();
		if (":rabbit:".equals(name)) return instance.u1f430();
		// frog face
		if (":u1f438:".equals(name)) return instance.u1f438();
		if (":frog:".equals(name)) return instance.u1f438();
		// tiger face
		if (":u1f42f:".equals(name)) return instance.u1f42f();
		if (":tiger:".equals(name)) return instance.u1f42f();
		// koala
		if (":u1f428:".equals(name)) return instance.u1f428();
		if (":koala:".equals(name)) return instance.u1f428();
		// bear face
		if (":u1f43b:".equals(name)) return instance.u1f43b();
		if (":bear:".equals(name)) return instance.u1f43b();
		// pig face
		if (":u1f437:".equals(name)) return instance.u1f437();
		if (":pig:".equals(name)) return instance.u1f437();
		// pig nose
		if (":u1f43d:".equals(name)) return instance.u1f43d();
		if (":pig_nose:".equals(name)) return instance.u1f43d();
		// cow face
		if (":u1f42e:".equals(name)) return instance.u1f42e();
		if (":cow:".equals(name)) return instance.u1f42e();
		// boar
		if (":u1f417:".equals(name)) return instance.u1f417();
		if (":boar:".equals(name)) return instance.u1f417();
		// monkey face
		if (":u1f435:".equals(name)) return instance.u1f435();
		if (":monkey_face:".equals(name)) return instance.u1f435();
		// monkey
		if (":u1f412:".equals(name)) return instance.u1f412();
		if (":monkey:".equals(name)) return instance.u1f412();
		// horse face
		if (":u1f434:".equals(name)) return instance.u1f434();
		if (":horse:".equals(name)) return instance.u1f434();
		// sheep
		if (":u1f411:".equals(name)) return instance.u1f411();
		if (":sheep:".equals(name)) return instance.u1f411();
		// elephant
		if (":u1f418:".equals(name)) return instance.u1f418();
		if (":elephant:".equals(name)) return instance.u1f418();
		// panda face
		if (":u1f43c:".equals(name)) return instance.u1f43c();
		if (":panda_face:".equals(name)) return instance.u1f43c();
		// penguin
		if (":u1f427:".equals(name)) return instance.u1f427();
		if (":penguin:".equals(name)) return instance.u1f427();
		// bird
		if (":u1f426:".equals(name)) return instance.u1f426();
		if (":bird:".equals(name)) return instance.u1f426();
		// baby chick
		if (":u1f424:".equals(name)) return instance.u1f424();
		if (":baby_chick:".equals(name)) return instance.u1f424();
		// front-facing baby chick
		if (":u1f425:".equals(name)) return instance.u1f425();
		if (":hatched_chick:".equals(name)) return instance.u1f425();
		// hatching chick
		if (":u1f423:".equals(name)) return instance.u1f423();
		if (":hatching_chick:".equals(name)) return instance.u1f423();
		// chicken
		if (":u1f414:".equals(name)) return instance.u1f414();
		if (":chicken:".equals(name)) return instance.u1f414();
		// snake
		if (":u1f40d:".equals(name)) return instance.u1f40d();
		if (":snake:".equals(name)) return instance.u1f40d();
		// turtle
		if (":u1f422:".equals(name)) return instance.u1f422();
		if (":turtle:".equals(name)) return instance.u1f422();
		// bug
		if (":u1f41b:".equals(name)) return instance.u1f41b();
		if (":bug:".equals(name)) return instance.u1f41b();
		// honeybee
		if (":u1f41d:".equals(name)) return instance.u1f41d();
		if (":bee:".equals(name)) return instance.u1f41d();
		if (":honeybee:".equals(name)) return instance.u1f41d();
		// ant
		if (":u1f41c:".equals(name)) return instance.u1f41c();
		if (":ant:".equals(name)) return instance.u1f41c();
		// lady beetle
		if (":u1f41e:".equals(name)) return instance.u1f41e();
		if (":beetle:".equals(name)) return instance.u1f41e();
		// snail
		if (":u1f40c:".equals(name)) return instance.u1f40c();
		if (":snail:".equals(name)) return instance.u1f40c();
		// octopus
		if (":u1f419:".equals(name)) return instance.u1f419();
		if (":octopus:".equals(name)) return instance.u1f419();
		// spiral shell
		if (":u1f41a:".equals(name)) return instance.u1f41a();
		if (":shell:".equals(name)) return instance.u1f41a();
		// tropical fish
		if (":u1f420:".equals(name)) return instance.u1f420();
		if (":tropical_fish:".equals(name)) return instance.u1f420();
		// fish
		if (":u1f41f:".equals(name)) return instance.u1f41f();
		if (":fish:".equals(name)) return instance.u1f41f();
		// dolphin
		if (":u1f42c:".equals(name)) return instance.u1f42c();
		if (":dolphin:".equals(name)) return instance.u1f42c();
		if (":flipper:".equals(name)) return instance.u1f42c();
		// spouting whale
		if (":u1f433:".equals(name)) return instance.u1f433();
		if (":whale:".equals(name)) return instance.u1f433();
		// whale
		if (":u1f40b:".equals(name)) return instance.u1f40b();
		if (":whale2:".equals(name)) return instance.u1f40b();
		// cow
		if (":u1f404:".equals(name)) return instance.u1f404();
		if (":cow2:".equals(name)) return instance.u1f404();
		// ram
		if (":u1f40f:".equals(name)) return instance.u1f40f();
		if (":ram:".equals(name)) return instance.u1f40f();
		// rat
		if (":u1f400:".equals(name)) return instance.u1f400();
		if (":rat:".equals(name)) return instance.u1f400();
		// water buffalo
		if (":u1f403:".equals(name)) return instance.u1f403();
		if (":water_buffalo:".equals(name)) return instance.u1f403();
		// tiger
		if (":u1f405:".equals(name)) return instance.u1f405();
		if (":tiger2:".equals(name)) return instance.u1f405();
		// rabbit
		if (":u1f407:".equals(name)) return instance.u1f407();
		if (":rabbit2:".equals(name)) return instance.u1f407();
		// dragon
		if (":u1f409:".equals(name)) return instance.u1f409();
		if (":dragon:".equals(name)) return instance.u1f409();
		// horse
		if (":u1f40e:".equals(name)) return instance.u1f40e();
		if (":racehorse:".equals(name)) return instance.u1f40e();
		// goat
		if (":u1f410:".equals(name)) return instance.u1f410();
		if (":goat:".equals(name)) return instance.u1f410();
		// rooster
		if (":u1f413:".equals(name)) return instance.u1f413();
		if (":rooster:".equals(name)) return instance.u1f413();
		// dog
		if (":u1f415:".equals(name)) return instance.u1f415();
		if (":dog2:".equals(name)) return instance.u1f415();
		// pig
		if (":u1f416:".equals(name)) return instance.u1f416();
		if (":pig2:".equals(name)) return instance.u1f416();
		// mouse
		if (":u1f401:".equals(name)) return instance.u1f401();
		if (":mouse2:".equals(name)) return instance.u1f401();
		// ox
		if (":u1f402:".equals(name)) return instance.u1f402();
		if (":ox:".equals(name)) return instance.u1f402();
		// dragon face
		if (":u1f432:".equals(name)) return instance.u1f432();
		if (":dragon_face:".equals(name)) return instance.u1f432();
		// blowfish
		if (":u1f421:".equals(name)) return instance.u1f421();
		if (":blowfish:".equals(name)) return instance.u1f421();
		// crocodile
		if (":u1f40a:".equals(name)) return instance.u1f40a();
		if (":crocodile:".equals(name)) return instance.u1f40a();
		// bactrian camel
		if (":u1f42b:".equals(name)) return instance.u1f42b();
		if (":camel:".equals(name)) return instance.u1f42b();
		// dromedary camel
		if (":u1f42a:".equals(name)) return instance.u1f42a();
		if (":dromedary_camel:".equals(name)) return instance.u1f42a();
		// leopard
		if (":u1f406:".equals(name)) return instance.u1f406();
		if (":leopard:".equals(name)) return instance.u1f406();
		// cat
		if (":u1f408:".equals(name)) return instance.u1f408();
		if (":cat2:".equals(name)) return instance.u1f408();
		// poodle
		if (":u1f429:".equals(name)) return instance.u1f429();
		if (":poodle:".equals(name)) return instance.u1f429();
		// paw prints
		if (":u1f43e:".equals(name)) return instance.u1f43e();
		if (":feet:".equals(name)) return instance.u1f43e();
		if (":paw_prints:".equals(name)) return instance.u1f43e();
		// bouquet
		if (":u1f490:".equals(name)) return instance.u1f490();
		if (":bouquet:".equals(name)) return instance.u1f490();
		// cherry blossom
		if (":u1f338:".equals(name)) return instance.u1f338();
		if (":cherry_blossom:".equals(name)) return instance.u1f338();
		// tulip
		if (":u1f337:".equals(name)) return instance.u1f337();
		if (":tulip:".equals(name)) return instance.u1f337();
		// four leaf clover
		if (":u1f340:".equals(name)) return instance.u1f340();
		if (":four_leaf_clover:".equals(name)) return instance.u1f340();
		// rose
		if (":u1f339:".equals(name)) return instance.u1f339();
		if (":rose:".equals(name)) return instance.u1f339();
		// sunflower
		if (":u1f33b:".equals(name)) return instance.u1f33b();
		if (":sunflower:".equals(name)) return instance.u1f33b();
		// hibiscus
		if (":u1f33a:".equals(name)) return instance.u1f33a();
		if (":hibiscus:".equals(name)) return instance.u1f33a();
		// maple leaf
		if (":u1f341:".equals(name)) return instance.u1f341();
		if (":maple_leaf:".equals(name)) return instance.u1f341();
		// leaf fluttering in wind
		if (":u1f343:".equals(name)) return instance.u1f343();
		if (":leaves:".equals(name)) return instance.u1f343();
		// fallen leaf
		if (":u1f342:".equals(name)) return instance.u1f342();
		if (":fallen_leaf:".equals(name)) return instance.u1f342();
		// herb
		if (":u1f33f:".equals(name)) return instance.u1f33f();
		if (":herb:".equals(name)) return instance.u1f33f();
		// ear of rice
		if (":u1f33e:".equals(name)) return instance.u1f33e();
		if (":ear_of_rice:".equals(name)) return instance.u1f33e();
		// mushroom
		if (":u1f344:".equals(name)) return instance.u1f344();
		if (":mushroom:".equals(name)) return instance.u1f344();
		// cactus
		if (":u1f335:".equals(name)) return instance.u1f335();
		if (":cactus:".equals(name)) return instance.u1f335();
		// palm tree
		if (":u1f334:".equals(name)) return instance.u1f334();
		if (":palm_tree:".equals(name)) return instance.u1f334();
		// evergreen tree
		if (":u1f332:".equals(name)) return instance.u1f332();
		if (":evergreen_tree:".equals(name)) return instance.u1f332();
		// deciduous tree
		if (":u1f333:".equals(name)) return instance.u1f333();
		if (":deciduous_tree:".equals(name)) return instance.u1f333();
		// chestnut
		if (":u1f330:".equals(name)) return instance.u1f330();
		if (":chestnut:".equals(name)) return instance.u1f330();
		// seedling
		if (":u1f331:".equals(name)) return instance.u1f331();
		if (":seedling:".equals(name)) return instance.u1f331();
		// blossom
		if (":u1f33c:".equals(name)) return instance.u1f33c();
		if (":blossom:".equals(name)) return instance.u1f33c();
		// globe with meridians
		if (":u1f310:".equals(name)) return instance.u1f310();
		if (":globe_with_meridians:".equals(name)) return instance.u1f310();
		// sun with face
		if (":u1f31e:".equals(name)) return instance.u1f31e();
		if (":sun_with_face:".equals(name)) return instance.u1f31e();
		// full moon with face
		if (":u1f31d:".equals(name)) return instance.u1f31d();
		if (":full_moon_with_face:".equals(name)) return instance.u1f31d();
		// new moon with face
		if (":u1f31a:".equals(name)) return instance.u1f31a();
		if (":new_moon_with_face:".equals(name)) return instance.u1f31a();
		// new moon symbol
		if (":u1f311:".equals(name)) return instance.u1f311();
		if (":new_moon:".equals(name)) return instance.u1f311();
		// waxing crescent moon symbol
		if (":u1f312:".equals(name)) return instance.u1f312();
		if (":waxing_crescent_moon:".equals(name)) return instance.u1f312();
		// first quarter moon symbol
		if (":u1f313:".equals(name)) return instance.u1f313();
		if (":first_quarter_moon:".equals(name)) return instance.u1f313();
		// waxing gibbous moon symbol
		if (":u1f314:".equals(name)) return instance.u1f314();
		if (":moon:".equals(name)) return instance.u1f314();
		if (":waxing_gibbous_moon:".equals(name)) return instance.u1f314();
		// full moon symbol
		if (":u1f315:".equals(name)) return instance.u1f315();
		if (":full_moon:".equals(name)) return instance.u1f315();
		// waning gibbous moon symbol
		if (":u1f316:".equals(name)) return instance.u1f316();
		if (":waning_gibbous_moon:".equals(name)) return instance.u1f316();
		// last quarter moon symbol
		if (":u1f317:".equals(name)) return instance.u1f317();
		if (":last_quarter_moon:".equals(name)) return instance.u1f317();
		// waning crescent moon symbol
		if (":u1f318:".equals(name)) return instance.u1f318();
		if (":waning_crescent_moon:".equals(name)) return instance.u1f318();
		// last quarter moon with face
		if (":u1f31c:".equals(name)) return instance.u1f31c();
		if (":last_quarter_moon_with_face:".equals(name))
			return instance.u1f31c();
		// first quarter moon with face
		if (":u1f31b:".equals(name)) return instance.u1f31b();
		if (":first_quarter_moon_with_face:".equals(name))
			return instance.u1f31b();
		// crescent moon
		if (":u1f319:".equals(name)) return instance.u1f319();
		if (":crescent_moon:".equals(name)) return instance.u1f319();
		// earth globe europe-africa
		if (":u1f30d:".equals(name)) return instance.u1f30d();
		if (":earth_africa:".equals(name)) return instance.u1f30d();
		// earth globe americas
		if (":u1f30e:".equals(name)) return instance.u1f30e();
		if (":earth_americas:".equals(name)) return instance.u1f30e();
		// earth globe asia-australia
		if (":u1f30f:".equals(name)) return instance.u1f30f();
		if (":earth_asia:".equals(name)) return instance.u1f30f();
		// volcano
		if (":u1f30b:".equals(name)) return instance.u1f30b();
		if (":volcano:".equals(name)) return instance.u1f30b();
		// milky way
		if (":u1f30c:".equals(name)) return instance.u1f30c();
		if (":milky_way:".equals(name)) return instance.u1f30c();
		// shooting star
		if (":u1f320:".equals(name)) return instance.u1f320();
		if (":stars:".equals(name)) return instance.u1f320();
		// white medium star
		if (":u2b50:".equals(name)) return instance.u2b50();
		if (":star:".equals(name)) return instance.u2b50();
		// black sun with rays
		if (":u2600:".equals(name)) return instance.u2600();
		if (":sunny:".equals(name)) return instance.u2600();
		// sun behind cloud
		if (":u26c5:".equals(name)) return instance.u26c5();
		if (":partly_sunny:".equals(name)) return instance.u26c5();
		// cloud
		if (":u2601:".equals(name)) return instance.u2601();
		if (":cloud:".equals(name)) return instance.u2601();
		// high voltage sign
		if (":u26a1:".equals(name)) return instance.u26a1();
		if (":zap:".equals(name)) return instance.u26a1();
		// umbrella with rain drops
		if (":u2614:".equals(name)) return instance.u2614();
		if (":umbrella:".equals(name)) return instance.u2614();
		// snowflake
		if (":u2744:".equals(name)) return instance.u2744();
		if (":snowflake:".equals(name)) return instance.u2744();
		// snowman without snow
		if (":u26c4:".equals(name)) return instance.u26c4();
		if (":snowman:".equals(name)) return instance.u26c4();
		// cyclone
		if (":u1f300:".equals(name)) return instance.u1f300();
		if (":cyclone:".equals(name)) return instance.u1f300();
		// foggy
		if (":u1f301:".equals(name)) return instance.u1f301();
		if (":foggy:".equals(name)) return instance.u1f301();
		// rainbow
		if (":u1f308:".equals(name)) return instance.u1f308();
		if (":rainbow:".equals(name)) return instance.u1f308();
		// water wave
		if (":u1f30a:".equals(name)) return instance.u1f30a();
		if (":ocean:".equals(name)) return instance.u1f30a();
		// pine decoration
		if (":u1f38d:".equals(name)) return instance.u1f38d();
		if (":bamboo:".equals(name)) return instance.u1f38d();
		// heart with ribbon
		if (":u1f49d:".equals(name)) return instance.u1f49d();
		if (":gift_heart:".equals(name)) return instance.u1f49d();
		// japanese dolls
		if (":u1f38e:".equals(name)) return instance.u1f38e();
		if (":dolls:".equals(name)) return instance.u1f38e();
		// school satchel
		if (":u1f392:".equals(name)) return instance.u1f392();
		if (":school_satchel:".equals(name)) return instance.u1f392();
		// graduation cap
		if (":u1f393:".equals(name)) return instance.u1f393();
		if (":mortar_board:".equals(name)) return instance.u1f393();
		// carp streamer
		if (":u1f38f:".equals(name)) return instance.u1f38f();
		if (":flags:".equals(name)) return instance.u1f38f();
		// fireworks
		if (":u1f386:".equals(name)) return instance.u1f386();
		if (":fireworks:".equals(name)) return instance.u1f386();
		// firework sparkler
		if (":u1f387:".equals(name)) return instance.u1f387();
		if (":sparkler:".equals(name)) return instance.u1f387();
		// wind chime
		if (":u1f390:".equals(name)) return instance.u1f390();
		if (":wind_chime:".equals(name)) return instance.u1f390();
		// moon viewing ceremony
		if (":u1f391:".equals(name)) return instance.u1f391();
		if (":rice_scene:".equals(name)) return instance.u1f391();
		// jack-o-lantern
		if (":u1f383:".equals(name)) return instance.u1f383();
		if (":jack_o_lantern:".equals(name)) return instance.u1f383();
		// ghost
		if (":u1f47b:".equals(name)) return instance.u1f47b();
		if (":ghost:".equals(name)) return instance.u1f47b();
		// father christmas
		if (":u1f385:".equals(name)) return instance.u1f385();
		if (":santa:".equals(name)) return instance.u1f385();
		// christmas tree
		if (":u1f384:".equals(name)) return instance.u1f384();
		if (":christmas_tree:".equals(name)) return instance.u1f384();
		// wrapped present
		if (":u1f381:".equals(name)) return instance.u1f381();
		if (":gift:".equals(name)) return instance.u1f381();
		// tanabata tree
		if (":u1f38b:".equals(name)) return instance.u1f38b();
		if (":tanabata_tree:".equals(name)) return instance.u1f38b();
		// party popper
		if (":u1f389:".equals(name)) return instance.u1f389();
		if (":tada:".equals(name)) return instance.u1f389();
		// confetti ball
		if (":u1f38a:".equals(name)) return instance.u1f38a();
		if (":confetti_ball:".equals(name)) return instance.u1f38a();
		// balloon
		if (":u1f388:".equals(name)) return instance.u1f388();
		if (":balloon:".equals(name)) return instance.u1f388();
		// crossed flags
		if (":u1f38c:".equals(name)) return instance.u1f38c();
		if (":crossed_flags:".equals(name)) return instance.u1f38c();
		// crystal ball
		if (":u1f52e:".equals(name)) return instance.u1f52e();
		if (":crystal_ball:".equals(name)) return instance.u1f52e();
		// movie camera
		if (":u1f3a5:".equals(name)) return instance.u1f3a5();
		if (":movie_camera:".equals(name)) return instance.u1f3a5();
		// camera
		if (":u1f4f7:".equals(name)) return instance.u1f4f7();
		if (":camera:".equals(name)) return instance.u1f4f7();
		// video camera
		if (":u1f4f9:".equals(name)) return instance.u1f4f9();
		if (":video_camera:".equals(name)) return instance.u1f4f9();
		// videocassette
		if (":u1f4fc:".equals(name)) return instance.u1f4fc();
		if (":vhs:".equals(name)) return instance.u1f4fc();
		// optical disc
		if (":u1f4bf:".equals(name)) return instance.u1f4bf();
		if (":cd:".equals(name)) return instance.u1f4bf();
		// dvd
		if (":u1f4c0:".equals(name)) return instance.u1f4c0();
		if (":dvd:".equals(name)) return instance.u1f4c0();
		// minidisc
		if (":u1f4bd:".equals(name)) return instance.u1f4bd();
		if (":minidisc:".equals(name)) return instance.u1f4bd();
		// floppy disk
		if (":u1f4be:".equals(name)) return instance.u1f4be();
		if (":floppy_disk:".equals(name)) return instance.u1f4be();
		// personal computer
		if (":u1f4bb:".equals(name)) return instance.u1f4bb();
		if (":computer:".equals(name)) return instance.u1f4bb();
		// mobile phone
		if (":u1f4f1:".equals(name)) return instance.u1f4f1();
		if (":iphone:".equals(name)) return instance.u1f4f1();
		// black telephone
		if (":u260e:".equals(name)) return instance.u260e();
		if (":phone:".equals(name)) return instance.u260e();
		if (":telephone:".equals(name)) return instance.u260e();
		// telephone receiver
		if (":u1f4de:".equals(name)) return instance.u1f4de();
		if (":telephone_receiver:".equals(name)) return instance.u1f4de();
		// pager
		if (":u1f4df:".equals(name)) return instance.u1f4df();
		if (":pager:".equals(name)) return instance.u1f4df();
		// fax machine
		if (":u1f4e0:".equals(name)) return instance.u1f4e0();
		if (":fax:".equals(name)) return instance.u1f4e0();
		// satellite antenna
		if (":u1f4e1:".equals(name)) return instance.u1f4e1();
		if (":satellite:".equals(name)) return instance.u1f4e1();
		// television
		if (":u1f4fa:".equals(name)) return instance.u1f4fa();
		if (":tv:".equals(name)) return instance.u1f4fa();
		// radio
		if (":u1f4fb:".equals(name)) return instance.u1f4fb();
		if (":radio:".equals(name)) return instance.u1f4fb();
		// speaker with three sound waves
		if (":u1f50a:".equals(name)) return instance.u1f50a();
		if (":loud_sound:".equals(name)) return instance.u1f50a();
		// speaker with one sound wave
		if (":u1f509:".equals(name)) return instance.u1f509();
		if (":sound:".equals(name)) return instance.u1f509();
		// speaker
		if (":u1f508:".equals(name)) return instance.u1f508();
		if (":speaker:".equals(name)) return instance.u1f508();
		// speaker with cancellation stroke
		if (":u1f507:".equals(name)) return instance.u1f507();
		if (":mute:".equals(name)) return instance.u1f507();
		// bell
		if (":u1f514:".equals(name)) return instance.u1f514();
		if (":bell:".equals(name)) return instance.u1f514();
		// bell with cancellation stroke
		if (":u1f515:".equals(name)) return instance.u1f515();
		if (":no_bell:".equals(name)) return instance.u1f515();
		// public address loudspeaker
		if (":u1f4e2:".equals(name)) return instance.u1f4e2();
		if (":loudspeaker:".equals(name)) return instance.u1f4e2();
		// cheering megaphone
		if (":u1f4e3:".equals(name)) return instance.u1f4e3();
		if (":mega:".equals(name)) return instance.u1f4e3();
		// hourglass with flowing sand
		if (":u23f3:".equals(name)) return instance.u23f3();
		if (":hourglass_flowing_sand:".equals(name)) return instance.u23f3();
		// hourglass
		if (":u231b:".equals(name)) return instance.u231b();
		if (":hourglass:".equals(name)) return instance.u231b();
		// alarm clock
		if (":u23f0:".equals(name)) return instance.u23f0();
		if (":alarm_clock:".equals(name)) return instance.u23f0();
		// watch
		if (":u231a:".equals(name)) return instance.u231a();
		if (":watch:".equals(name)) return instance.u231a();
		// open lock
		if (":u1f513:".equals(name)) return instance.u1f513();
		if (":unlock:".equals(name)) return instance.u1f513();
		// lock
		if (":u1f512:".equals(name)) return instance.u1f512();
		if (":lock:".equals(name)) return instance.u1f512();
		// lock with ink pen
		if (":u1f50f:".equals(name)) return instance.u1f50f();
		if (":lock_with_ink_pen:".equals(name)) return instance.u1f50f();
		// closed lock with key
		if (":u1f510:".equals(name)) return instance.u1f510();
		if (":closed_lock_with_key:".equals(name)) return instance.u1f510();
		// key
		if (":u1f511:".equals(name)) return instance.u1f511();
		if (":key:".equals(name)) return instance.u1f511();
		// right-pointing magnifying glass
		if (":u1f50e:".equals(name)) return instance.u1f50e();
		if (":mag_right:".equals(name)) return instance.u1f50e();
		// electric light bulb
		if (":u1f4a1:".equals(name)) return instance.u1f4a1();
		if (":bulb:".equals(name)) return instance.u1f4a1();
		// electric torch
		if (":u1f526:".equals(name)) return instance.u1f526();
		if (":flashlight:".equals(name)) return instance.u1f526();
		// high brightness symbol
		if (":u1f506:".equals(name)) return instance.u1f506();
		if (":high_brightness:".equals(name)) return instance.u1f506();
		// low brightness symbol
		if (":u1f505:".equals(name)) return instance.u1f505();
		if (":low_brightness:".equals(name)) return instance.u1f505();
		// electric plug
		if (":u1f50c:".equals(name)) return instance.u1f50c();
		if (":electric_plug:".equals(name)) return instance.u1f50c();
		// battery
		if (":u1f50b:".equals(name)) return instance.u1f50b();
		if (":battery:".equals(name)) return instance.u1f50b();
		// left-pointing magnifying glass
		if (":u1f50d:".equals(name)) return instance.u1f50d();
		if (":mag:".equals(name)) return instance.u1f50d();
		// bathtub
		if (":u1f6c1:".equals(name)) return instance.u1f6c1();
		if (":bathtub:".equals(name)) return instance.u1f6c1();
		// bath
		if (":u1f6c0:".equals(name)) return instance.u1f6c0();
		if (":bath:".equals(name)) return instance.u1f6c0();
		// shower
		if (":u1f6bf:".equals(name)) return instance.u1f6bf();
		if (":shower:".equals(name)) return instance.u1f6bf();
		// toilet
		if (":u1f6bd:".equals(name)) return instance.u1f6bd();
		if (":toilet:".equals(name)) return instance.u1f6bd();
		// wrench
		if (":u1f527:".equals(name)) return instance.u1f527();
		if (":wrench:".equals(name)) return instance.u1f527();
		// nut and bolt
		if (":u1f529:".equals(name)) return instance.u1f529();
		if (":nut_and_bolt:".equals(name)) return instance.u1f529();
		// hammer
		if (":u1f528:".equals(name)) return instance.u1f528();
		if (":hammer:".equals(name)) return instance.u1f528();
		// door
		if (":u1f6aa:".equals(name)) return instance.u1f6aa();
		if (":door:".equals(name)) return instance.u1f6aa();
		// smoking symbol
		if (":u1f6ac:".equals(name)) return instance.u1f6ac();
		if (":smoking:".equals(name)) return instance.u1f6ac();
		// bomb
		if (":u1f4a3:".equals(name)) return instance.u1f4a3();
		if (":bomb:".equals(name)) return instance.u1f4a3();
		// pistol
		if (":u1f52b:".equals(name)) return instance.u1f52b();
		if (":gun:".equals(name)) return instance.u1f52b();
		// hocho
		if (":u1f52a:".equals(name)) return instance.u1f52a();
		if (":hocho:".equals(name)) return instance.u1f52a();
		if (":knife:".equals(name)) return instance.u1f52a();
		// pill
		if (":u1f48a:".equals(name)) return instance.u1f48a();
		if (":pill:".equals(name)) return instance.u1f48a();
		// syringe
		if (":u1f489:".equals(name)) return instance.u1f489();
		if (":syringe:".equals(name)) return instance.u1f489();
		// money bag
		if (":u1f4b0:".equals(name)) return instance.u1f4b0();
		if (":moneybag:".equals(name)) return instance.u1f4b0();
		// banknote with yen sign
		if (":u1f4b4:".equals(name)) return instance.u1f4b4();
		if (":yen:".equals(name)) return instance.u1f4b4();
		// banknote with dollar sign
		if (":u1f4b5:".equals(name)) return instance.u1f4b5();
		if (":dollar:".equals(name)) return instance.u1f4b5();
		// banknote with pound sign
		if (":u1f4b7:".equals(name)) return instance.u1f4b7();
		if (":pound:".equals(name)) return instance.u1f4b7();
		// banknote with euro sign
		if (":u1f4b6:".equals(name)) return instance.u1f4b6();
		if (":euro:".equals(name)) return instance.u1f4b6();
		// credit card
		if (":u1f4b3:".equals(name)) return instance.u1f4b3();
		if (":credit_card:".equals(name)) return instance.u1f4b3();
		// money with wings
		if (":u1f4b8:".equals(name)) return instance.u1f4b8();
		if (":money_with_wings:".equals(name)) return instance.u1f4b8();
		// mobile phone with rightwards arrow at left
		if (":u1f4f2:".equals(name)) return instance.u1f4f2();
		if (":calling:".equals(name)) return instance.u1f4f2();
		// e-mail symbol
		if (":u1f4e7:".equals(name)) return instance.u1f4e7();
		if (":e-mail:".equals(name)) return instance.u1f4e7();
		// inbox tray
		if (":u1f4e5:".equals(name)) return instance.u1f4e5();
		if (":inbox_tray:".equals(name)) return instance.u1f4e5();
		// outbox tray
		if (":u1f4e4:".equals(name)) return instance.u1f4e4();
		if (":outbox_tray:".equals(name)) return instance.u1f4e4();
		// envelope
		if (":u2709:".equals(name)) return instance.u2709();
		if (":email:".equals(name)) return instance.u2709();
		if (":envelope:".equals(name)) return instance.u2709();
		// envelope with downwards arrow above
		if (":u1f4e9:".equals(name)) return instance.u1f4e9();
		if (":envelope_with_arrow:".equals(name)) return instance.u1f4e9();
		// incoming envelope
		if (":u1f4e8:".equals(name)) return instance.u1f4e8();
		if (":incoming_envelope:".equals(name)) return instance.u1f4e8();
		// postal horn
		if (":u1f4ef:".equals(name)) return instance.u1f4ef();
		if (":postal_horn:".equals(name)) return instance.u1f4ef();
		// closed mailbox with raised flag
		if (":u1f4eb:".equals(name)) return instance.u1f4eb();
		if (":mailbox:".equals(name)) return instance.u1f4eb();
		// closed mailbox with lowered flag
		if (":u1f4ea:".equals(name)) return instance.u1f4ea();
		if (":mailbox_closed:".equals(name)) return instance.u1f4ea();
		// open mailbox with raised flag
		if (":u1f4ec:".equals(name)) return instance.u1f4ec();
		if (":mailbox_with_mail:".equals(name)) return instance.u1f4ec();
		// open mailbox with lowered flag
		if (":u1f4ed:".equals(name)) return instance.u1f4ed();
		if (":mailbox_with_no_mail:".equals(name)) return instance.u1f4ed();
		// postbox
		if (":u1f4ee:".equals(name)) return instance.u1f4ee();
		if (":postbox:".equals(name)) return instance.u1f4ee();
		// package
		if (":u1f4e6:".equals(name)) return instance.u1f4e6();
		if (":package:".equals(name)) return instance.u1f4e6();
		// memo
		if (":u1f4dd:".equals(name)) return instance.u1f4dd();
		if (":memo:".equals(name)) return instance.u1f4dd();
		if (":pencil:".equals(name)) return instance.u1f4dd();
		// page facing up
		if (":u1f4c4:".equals(name)) return instance.u1f4c4();
		if (":page_facing_up:".equals(name)) return instance.u1f4c4();
		// page with curl
		if (":u1f4c3:".equals(name)) return instance.u1f4c3();
		if (":page_with_curl:".equals(name)) return instance.u1f4c3();
		// bookmark tabs
		if (":u1f4d1:".equals(name)) return instance.u1f4d1();
		if (":bookmark_tabs:".equals(name)) return instance.u1f4d1();
		// bar chart
		if (":u1f4ca:".equals(name)) return instance.u1f4ca();
		if (":bar_chart:".equals(name)) return instance.u1f4ca();
		// chart with upwards trend
		if (":u1f4c8:".equals(name)) return instance.u1f4c8();
		if (":chart_with_upwards_trend:".equals(name)) return instance.u1f4c8();
		// chart with downwards trend
		if (":u1f4c9:".equals(name)) return instance.u1f4c9();
		if (":chart_with_downwards_trend:".equals(name))
			return instance.u1f4c9();
		// scroll
		if (":u1f4dc:".equals(name)) return instance.u1f4dc();
		if (":scroll:".equals(name)) return instance.u1f4dc();
		// clipboard
		if (":u1f4cb:".equals(name)) return instance.u1f4cb();
		if (":clipboard:".equals(name)) return instance.u1f4cb();
		// calendar
		if (":u1f4c5:".equals(name)) return instance.u1f4c5();
		if (":date:".equals(name)) return instance.u1f4c5();
		// tear-off calendar
		if (":u1f4c6:".equals(name)) return instance.u1f4c6();
		if (":calendar:".equals(name)) return instance.u1f4c6();
		// card index
		if (":u1f4c7:".equals(name)) return instance.u1f4c7();
		if (":card_index:".equals(name)) return instance.u1f4c7();
		// file folder
		if (":u1f4c1:".equals(name)) return instance.u1f4c1();
		if (":file_folder:".equals(name)) return instance.u1f4c1();
		// open file folder
		if (":u1f4c2:".equals(name)) return instance.u1f4c2();
		if (":open_file_folder:".equals(name)) return instance.u1f4c2();
		// black scissors
		if (":u2702:".equals(name)) return instance.u2702();
		if (":scissors:".equals(name)) return instance.u2702();
		// pushpin
		if (":u1f4cc:".equals(name)) return instance.u1f4cc();
		if (":pushpin:".equals(name)) return instance.u1f4cc();
		// paperclip
		if (":u1f4ce:".equals(name)) return instance.u1f4ce();
		if (":paperclip:".equals(name)) return instance.u1f4ce();
		// black nib
		if (":u2712:".equals(name)) return instance.u2712();
		if (":black_nib:".equals(name)) return instance.u2712();
		// pencil
		if (":u270f:".equals(name)) return instance.u270f();
		if (":pencil2:".equals(name)) return instance.u270f();
		// straight ruler
		if (":u1f4cf:".equals(name)) return instance.u1f4cf();
		if (":straight_ruler:".equals(name)) return instance.u1f4cf();
		// triangular ruler
		if (":u1f4d0:".equals(name)) return instance.u1f4d0();
		if (":triangular_ruler:".equals(name)) return instance.u1f4d0();
		// closed book
		if (":u1f4d5:".equals(name)) return instance.u1f4d5();
		if (":closed_book:".equals(name)) return instance.u1f4d5();
		// green book
		if (":u1f4d7:".equals(name)) return instance.u1f4d7();
		if (":green_book:".equals(name)) return instance.u1f4d7();
		// blue book
		if (":u1f4d8:".equals(name)) return instance.u1f4d8();
		if (":blue_book:".equals(name)) return instance.u1f4d8();
		// orange book
		if (":u1f4d9:".equals(name)) return instance.u1f4d9();
		if (":orange_book:".equals(name)) return instance.u1f4d9();
		// notebook
		if (":u1f4d3:".equals(name)) return instance.u1f4d3();
		if (":notebook:".equals(name)) return instance.u1f4d3();
		// notebook with decorative cover
		if (":u1f4d4:".equals(name)) return instance.u1f4d4();
		if (":notebook_with_decorative_cover:".equals(name))
			return instance.u1f4d4();
		// ledger
		if (":u1f4d2:".equals(name)) return instance.u1f4d2();
		if (":ledger:".equals(name)) return instance.u1f4d2();
		// books
		if (":u1f4da:".equals(name)) return instance.u1f4da();
		if (":books:".equals(name)) return instance.u1f4da();
		// open book
		if (":u1f4d6:".equals(name)) return instance.u1f4d6();
		if (":book:".equals(name)) return instance.u1f4d6();
		if (":open_book:".equals(name)) return instance.u1f4d6();
		// bookmark
		if (":u1f516:".equals(name)) return instance.u1f516();
		if (":bookmark:".equals(name)) return instance.u1f516();
		// name badge
		if (":u1f4db:".equals(name)) return instance.u1f4db();
		if (":name_badge:".equals(name)) return instance.u1f4db();
		// microscope
		if (":u1f52c:".equals(name)) return instance.u1f52c();
		if (":microscope:".equals(name)) return instance.u1f52c();
		// telescope
		if (":u1f52d:".equals(name)) return instance.u1f52d();
		if (":telescope:".equals(name)) return instance.u1f52d();
		// newspaper
		if (":u1f4f0:".equals(name)) return instance.u1f4f0();
		if (":newspaper:".equals(name)) return instance.u1f4f0();
		// artist palette
		if (":u1f3a8:".equals(name)) return instance.u1f3a8();
		if (":art:".equals(name)) return instance.u1f3a8();
		// clapper board
		if (":u1f3ac:".equals(name)) return instance.u1f3ac();
		if (":clapper:".equals(name)) return instance.u1f3ac();
		// microphone
		if (":u1f3a4:".equals(name)) return instance.u1f3a4();
		if (":microphone:".equals(name)) return instance.u1f3a4();
		// headphone
		if (":u1f3a7:".equals(name)) return instance.u1f3a7();
		if (":headphones:".equals(name)) return instance.u1f3a7();
		// musical score
		if (":u1f3bc:".equals(name)) return instance.u1f3bc();
		if (":musical_score:".equals(name)) return instance.u1f3bc();
		// musical note
		if (":u1f3b5:".equals(name)) return instance.u1f3b5();
		if (":musical_note:".equals(name)) return instance.u1f3b5();
		// multiple musical notes
		if (":u1f3b6:".equals(name)) return instance.u1f3b6();
		if (":notes:".equals(name)) return instance.u1f3b6();
		// musical keyboard
		if (":u1f3b9:".equals(name)) return instance.u1f3b9();
		if (":musical_keyboard:".equals(name)) return instance.u1f3b9();
		// violin
		if (":u1f3bb:".equals(name)) return instance.u1f3bb();
		if (":violin:".equals(name)) return instance.u1f3bb();
		// trumpet
		if (":u1f3ba:".equals(name)) return instance.u1f3ba();
		if (":trumpet:".equals(name)) return instance.u1f3ba();
		// saxophone
		if (":u1f3b7:".equals(name)) return instance.u1f3b7();
		if (":saxophone:".equals(name)) return instance.u1f3b7();
		// guitar
		if (":u1f3b8:".equals(name)) return instance.u1f3b8();
		if (":guitar:".equals(name)) return instance.u1f3b8();
		// alien monster
		if (":u1f47e:".equals(name)) return instance.u1f47e();
		if (":space_invader:".equals(name)) return instance.u1f47e();
		// video game
		if (":u1f3ae:".equals(name)) return instance.u1f3ae();
		if (":video_game:".equals(name)) return instance.u1f3ae();
		// playing card black joker
		if (":u1f0cf:".equals(name)) return instance.u1f0cf();
		if (":black_joker:".equals(name)) return instance.u1f0cf();
		// flower playing cards
		if (":u1f3b4:".equals(name)) return instance.u1f3b4();
		if (":flower_playing_cards:".equals(name)) return instance.u1f3b4();
		// mahjong tile red dragon
		if (":u1f004:".equals(name)) return instance.u1f004();
		if (":mahjong:".equals(name)) return instance.u1f004();
		// game die
		if (":u1f3b2:".equals(name)) return instance.u1f3b2();
		if (":game_die:".equals(name)) return instance.u1f3b2();
		// direct hit
		if (":u1f3af:".equals(name)) return instance.u1f3af();
		if (":dart:".equals(name)) return instance.u1f3af();
		// american football
		if (":u1f3c8:".equals(name)) return instance.u1f3c8();
		if (":football:".equals(name)) return instance.u1f3c8();
		// basketball and hoop
		if (":u1f3c0:".equals(name)) return instance.u1f3c0();
		if (":basketball:".equals(name)) return instance.u1f3c0();
		// soccer ball
		if (":u26bd:".equals(name)) return instance.u26bd();
		if (":soccer:".equals(name)) return instance.u26bd();
		// baseball
		if (":u26be:".equals(name)) return instance.u26be();
		if (":baseball:".equals(name)) return instance.u26be();
		// tennis racquet and ball
		if (":u1f3be:".equals(name)) return instance.u1f3be();
		if (":tennis:".equals(name)) return instance.u1f3be();
		// billiards
		if (":u1f3b1:".equals(name)) return instance.u1f3b1();
		if (":8ball:".equals(name)) return instance.u1f3b1();
		// rugby football
		if (":u1f3c9:".equals(name)) return instance.u1f3c9();
		if (":rugby_football:".equals(name)) return instance.u1f3c9();
		// bowling
		if (":u1f3b3:".equals(name)) return instance.u1f3b3();
		if (":bowling:".equals(name)) return instance.u1f3b3();
		// flag in hole
		if (":u26f3:".equals(name)) return instance.u26f3();
		if (":golf:".equals(name)) return instance.u26f3();
		// mountain bicyclist
		if (":u1f6b5:".equals(name)) return instance.u1f6b5();
		if (":mountain_bicyclist:".equals(name)) return instance.u1f6b5();
		// bicyclist
		if (":u1f6b4:".equals(name)) return instance.u1f6b4();
		if (":bicyclist:".equals(name)) return instance.u1f6b4();
		// chequered flag
		if (":u1f3c1:".equals(name)) return instance.u1f3c1();
		if (":checkered_flag:".equals(name)) return instance.u1f3c1();
		// horse racing
		if (":u1f3c7:".equals(name)) return instance.u1f3c7();
		if (":horse_racing:".equals(name)) return instance.u1f3c7();
		// trophy
		if (":u1f3c6:".equals(name)) return instance.u1f3c6();
		if (":trophy:".equals(name)) return instance.u1f3c6();
		// ski and ski boot
		if (":u1f3bf:".equals(name)) return instance.u1f3bf();
		if (":ski:".equals(name)) return instance.u1f3bf();
		// snowboarder
		if (":u1f3c2:".equals(name)) return instance.u1f3c2();
		if (":snowboarder:".equals(name)) return instance.u1f3c2();
		// swimmer
		if (":u1f3ca:".equals(name)) return instance.u1f3ca();
		if (":swimmer:".equals(name)) return instance.u1f3ca();
		// surfer
		if (":u1f3c4:".equals(name)) return instance.u1f3c4();
		if (":surfer:".equals(name)) return instance.u1f3c4();
		// fishing pole and fish
		if (":u1f3a3:".equals(name)) return instance.u1f3a3();
		if (":fishing_pole_and_fish:".equals(name)) return instance.u1f3a3();
		// hot beverage
		if (":u2615:".equals(name)) return instance.u2615();
		if (":coffee:".equals(name)) return instance.u2615();
		// teacup without handle
		if (":u1f375:".equals(name)) return instance.u1f375();
		if (":tea:".equals(name)) return instance.u1f375();
		// sake bottle and cup
		if (":u1f376:".equals(name)) return instance.u1f376();
		if (":sake:".equals(name)) return instance.u1f376();
		// baby bottle
		if (":u1f37c:".equals(name)) return instance.u1f37c();
		if (":baby_bottle:".equals(name)) return instance.u1f37c();
		// beer mug
		if (":u1f37a:".equals(name)) return instance.u1f37a();
		if (":beer:".equals(name)) return instance.u1f37a();
		// clinking beer mugs
		if (":u1f37b:".equals(name)) return instance.u1f37b();
		if (":beers:".equals(name)) return instance.u1f37b();
		// cocktail glass
		if (":u1f378:".equals(name)) return instance.u1f378();
		if (":cocktail:".equals(name)) return instance.u1f378();
		// tropical drink
		if (":u1f379:".equals(name)) return instance.u1f379();
		if (":tropical_drink:".equals(name)) return instance.u1f379();
		// wine glass
		if (":u1f377:".equals(name)) return instance.u1f377();
		if (":wine_glass:".equals(name)) return instance.u1f377();
		// fork and knife
		if (":u1f374:".equals(name)) return instance.u1f374();
		if (":fork_and_knife:".equals(name)) return instance.u1f374();
		// slice of pizza
		if (":u1f355:".equals(name)) return instance.u1f355();
		if (":pizza:".equals(name)) return instance.u1f355();
		// hamburger
		if (":u1f354:".equals(name)) return instance.u1f354();
		if (":hamburger:".equals(name)) return instance.u1f354();
		// french fries
		if (":u1f35f:".equals(name)) return instance.u1f35f();
		if (":fries:".equals(name)) return instance.u1f35f();
		// poultry leg
		if (":u1f357:".equals(name)) return instance.u1f357();
		if (":poultry_leg:".equals(name)) return instance.u1f357();
		// meat on bone
		if (":u1f356:".equals(name)) return instance.u1f356();
		if (":meat_on_bone:".equals(name)) return instance.u1f356();
		// spaghetti
		if (":u1f35d:".equals(name)) return instance.u1f35d();
		if (":spaghetti:".equals(name)) return instance.u1f35d();
		// curry and rice
		if (":u1f35b:".equals(name)) return instance.u1f35b();
		if (":curry:".equals(name)) return instance.u1f35b();
		// fried shrimp
		if (":u1f364:".equals(name)) return instance.u1f364();
		if (":fried_shrimp:".equals(name)) return instance.u1f364();
		// bento box
		if (":u1f371:".equals(name)) return instance.u1f371();
		if (":bento:".equals(name)) return instance.u1f371();
		// sushi
		if (":u1f363:".equals(name)) return instance.u1f363();
		if (":sushi:".equals(name)) return instance.u1f363();
		// fish cake with swirl design
		if (":u1f365:".equals(name)) return instance.u1f365();
		if (":fish_cake:".equals(name)) return instance.u1f365();
		// rice ball
		if (":u1f359:".equals(name)) return instance.u1f359();
		if (":rice_ball:".equals(name)) return instance.u1f359();
		// rice cracker
		if (":u1f358:".equals(name)) return instance.u1f358();
		if (":rice_cracker:".equals(name)) return instance.u1f358();
		// cooked rice
		if (":u1f35a:".equals(name)) return instance.u1f35a();
		if (":rice:".equals(name)) return instance.u1f35a();
		// steaming bowl
		if (":u1f35c:".equals(name)) return instance.u1f35c();
		if (":ramen:".equals(name)) return instance.u1f35c();
		// pot of food
		if (":u1f372:".equals(name)) return instance.u1f372();
		if (":stew:".equals(name)) return instance.u1f372();
		// oden
		if (":u1f362:".equals(name)) return instance.u1f362();
		if (":oden:".equals(name)) return instance.u1f362();
		// dango
		if (":u1f361:".equals(name)) return instance.u1f361();
		if (":dango:".equals(name)) return instance.u1f361();
		// cooking
		if (":u1f373:".equals(name)) return instance.u1f373();
		if (":egg:".equals(name)) return instance.u1f373();
		// bread
		if (":u1f35e:".equals(name)) return instance.u1f35e();
		if (":bread:".equals(name)) return instance.u1f35e();
		// doughnut
		if (":u1f369:".equals(name)) return instance.u1f369();
		if (":doughnut:".equals(name)) return instance.u1f369();
		// custard
		if (":u1f36e:".equals(name)) return instance.u1f36e();
		if (":custard:".equals(name)) return instance.u1f36e();
		// soft ice cream
		if (":u1f366:".equals(name)) return instance.u1f366();
		if (":icecream:".equals(name)) return instance.u1f366();
		// ice cream
		if (":u1f368:".equals(name)) return instance.u1f368();
		if (":ice_cream:".equals(name)) return instance.u1f368();
		// shaved ice
		if (":u1f367:".equals(name)) return instance.u1f367();
		if (":shaved_ice:".equals(name)) return instance.u1f367();
		// birthday cake
		if (":u1f382:".equals(name)) return instance.u1f382();
		if (":birthday:".equals(name)) return instance.u1f382();
		// shortcake
		if (":u1f370:".equals(name)) return instance.u1f370();
		if (":cake:".equals(name)) return instance.u1f370();
		// cookie
		if (":u1f36a:".equals(name)) return instance.u1f36a();
		if (":cookie:".equals(name)) return instance.u1f36a();
		// chocolate bar
		if (":u1f36b:".equals(name)) return instance.u1f36b();
		if (":chocolate_bar:".equals(name)) return instance.u1f36b();
		// candy
		if (":u1f36c:".equals(name)) return instance.u1f36c();
		if (":candy:".equals(name)) return instance.u1f36c();
		// lollipop
		if (":u1f36d:".equals(name)) return instance.u1f36d();
		if (":lollipop:".equals(name)) return instance.u1f36d();
		// honey pot
		if (":u1f36f:".equals(name)) return instance.u1f36f();
		if (":honey_pot:".equals(name)) return instance.u1f36f();
		// red apple
		if (":u1f34e:".equals(name)) return instance.u1f34e();
		if (":apple:".equals(name)) return instance.u1f34e();
		// green apple
		if (":u1f34f:".equals(name)) return instance.u1f34f();
		if (":green_apple:".equals(name)) return instance.u1f34f();
		// tangerine
		if (":u1f34a:".equals(name)) return instance.u1f34a();
		if (":tangerine:".equals(name)) return instance.u1f34a();
		// lemon
		if (":u1f34b:".equals(name)) return instance.u1f34b();
		if (":lemon:".equals(name)) return instance.u1f34b();
		// cherries
		if (":u1f352:".equals(name)) return instance.u1f352();
		if (":cherries:".equals(name)) return instance.u1f352();
		// grapes
		if (":u1f347:".equals(name)) return instance.u1f347();
		if (":grapes:".equals(name)) return instance.u1f347();
		// watermelon
		if (":u1f349:".equals(name)) return instance.u1f349();
		if (":watermelon:".equals(name)) return instance.u1f349();
		// strawberry
		if (":u1f353:".equals(name)) return instance.u1f353();
		if (":strawberry:".equals(name)) return instance.u1f353();
		// peach
		if (":u1f351:".equals(name)) return instance.u1f351();
		if (":peach:".equals(name)) return instance.u1f351();
		// melon
		if (":u1f348:".equals(name)) return instance.u1f348();
		if (":melon:".equals(name)) return instance.u1f348();
		// banana
		if (":u1f34c:".equals(name)) return instance.u1f34c();
		if (":banana:".equals(name)) return instance.u1f34c();
		// pear
		if (":u1f350:".equals(name)) return instance.u1f350();
		if (":pear:".equals(name)) return instance.u1f350();
		// pineapple
		if (":u1f34d:".equals(name)) return instance.u1f34d();
		if (":pineapple:".equals(name)) return instance.u1f34d();
		// roasted sweet potato
		if (":u1f360:".equals(name)) return instance.u1f360();
		if (":sweet_potato:".equals(name)) return instance.u1f360();
		// aubergine
		if (":u1f346:".equals(name)) return instance.u1f346();
		if (":eggplant:".equals(name)) return instance.u1f346();
		// tomato
		if (":u1f345:".equals(name)) return instance.u1f345();
		if (":tomato:".equals(name)) return instance.u1f345();
		// ear of maize
		if (":u1f33d:".equals(name)) return instance.u1f33d();
		if (":corn:".equals(name)) return instance.u1f33d();
		// house building
		if (":u1f3e0:".equals(name)) return instance.u1f3e0();
		if (":house:".equals(name)) return instance.u1f3e0();
		// house with garden
		if (":u1f3e1:".equals(name)) return instance.u1f3e1();
		if (":house_with_garden:".equals(name)) return instance.u1f3e1();
		// school
		if (":u1f3eb:".equals(name)) return instance.u1f3eb();
		if (":school:".equals(name)) return instance.u1f3eb();
		// office building
		if (":u1f3e2:".equals(name)) return instance.u1f3e2();
		if (":office:".equals(name)) return instance.u1f3e2();
		// japanese post office
		if (":u1f3e3:".equals(name)) return instance.u1f3e3();
		if (":post_office:".equals(name)) return instance.u1f3e3();
		// hospital
		if (":u1f3e5:".equals(name)) return instance.u1f3e5();
		if (":hospital:".equals(name)) return instance.u1f3e5();
		// bank
		if (":u1f3e6:".equals(name)) return instance.u1f3e6();
		if (":bank:".equals(name)) return instance.u1f3e6();
		// convenience store
		if (":u1f3ea:".equals(name)) return instance.u1f3ea();
		if (":convenience_store:".equals(name)) return instance.u1f3ea();
		// love hotel
		if (":u1f3e9:".equals(name)) return instance.u1f3e9();
		if (":love_hotel:".equals(name)) return instance.u1f3e9();
		// hotel
		if (":u1f3e8:".equals(name)) return instance.u1f3e8();
		if (":hotel:".equals(name)) return instance.u1f3e8();
		// wedding
		if (":u1f492:".equals(name)) return instance.u1f492();
		if (":wedding:".equals(name)) return instance.u1f492();
		// church
		if (":u26ea:".equals(name)) return instance.u26ea();
		if (":church:".equals(name)) return instance.u26ea();
		// department store
		if (":u1f3ec:".equals(name)) return instance.u1f3ec();
		if (":department_store:".equals(name)) return instance.u1f3ec();
		// european post office
		if (":u1f3e4:".equals(name)) return instance.u1f3e4();
		if (":european_post_office:".equals(name)) return instance.u1f3e4();
		// sunset over buildings
		if (":u1f307:".equals(name)) return instance.u1f307();
		if (":city_sunrise:".equals(name)) return instance.u1f307();
		// cityscape at dusk
		if (":u1f306:".equals(name)) return instance.u1f306();
		if (":city_sunset:".equals(name)) return instance.u1f306();
		// japanese castle
		if (":u1f3ef:".equals(name)) return instance.u1f3ef();
		if (":japanese_castle:".equals(name)) return instance.u1f3ef();
		// european castle
		if (":u1f3f0:".equals(name)) return instance.u1f3f0();
		if (":european_castle:".equals(name)) return instance.u1f3f0();
		// tent
		if (":u26fa:".equals(name)) return instance.u26fa();
		if (":tent:".equals(name)) return instance.u26fa();
		// factory
		if (":u1f3ed:".equals(name)) return instance.u1f3ed();
		if (":factory:".equals(name)) return instance.u1f3ed();
		// tokyo tower
		if (":u1f5fc:".equals(name)) return instance.u1f5fc();
		if (":tokyo_tower:".equals(name)) return instance.u1f5fc();
		// silhouette of japan
		if (":u1f5fe:".equals(name)) return instance.u1f5fe();
		if (":japan:".equals(name)) return instance.u1f5fe();
		// mount fuji
		if (":u1f5fb:".equals(name)) return instance.u1f5fb();
		if (":mount_fuji:".equals(name)) return instance.u1f5fb();
		// sunrise over mountains
		if (":u1f304:".equals(name)) return instance.u1f304();
		if (":sunrise_over_mountains:".equals(name)) return instance.u1f304();
		// sunrise
		if (":u1f305:".equals(name)) return instance.u1f305();
		if (":sunrise:".equals(name)) return instance.u1f305();
		// night with stars
		if (":u1f303:".equals(name)) return instance.u1f303();
		if (":night_with_stars:".equals(name)) return instance.u1f303();
		// statue of liberty
		if (":u1f5fd:".equals(name)) return instance.u1f5fd();
		if (":statue_of_liberty:".equals(name)) return instance.u1f5fd();
		// bridge at night
		if (":u1f309:".equals(name)) return instance.u1f309();
		if (":bridge_at_night:".equals(name)) return instance.u1f309();
		// carousel horse
		if (":u1f3a0:".equals(name)) return instance.u1f3a0();
		if (":carousel_horse:".equals(name)) return instance.u1f3a0();
		// ferris wheel
		if (":u1f3a1:".equals(name)) return instance.u1f3a1();
		if (":ferris_wheel:".equals(name)) return instance.u1f3a1();
		// fountain
		if (":u26f2:".equals(name)) return instance.u26f2();
		if (":fountain:".equals(name)) return instance.u26f2();
		// roller coaster
		if (":u1f3a2:".equals(name)) return instance.u1f3a2();
		if (":roller_coaster:".equals(name)) return instance.u1f3a2();
		// ship
		if (":u1f6a2:".equals(name)) return instance.u1f6a2();
		if (":ship:".equals(name)) return instance.u1f6a2();
		// sailboat
		if (":u26f5:".equals(name)) return instance.u26f5();
		if (":boat:".equals(name)) return instance.u26f5();
		if (":sailboat:".equals(name)) return instance.u26f5();
		// speedboat
		if (":u1f6a4:".equals(name)) return instance.u1f6a4();
		if (":speedboat:".equals(name)) return instance.u1f6a4();
		// rowboat
		if (":u1f6a3:".equals(name)) return instance.u1f6a3();
		if (":rowboat:".equals(name)) return instance.u1f6a3();
		// anchor
		if (":u2693:".equals(name)) return instance.u2693();
		if (":anchor:".equals(name)) return instance.u2693();
		// rocket
		if (":u1f680:".equals(name)) return instance.u1f680();
		if (":rocket:".equals(name)) return instance.u1f680();
		// airplane
		if (":u2708:".equals(name)) return instance.u2708();
		if (":airplane:".equals(name)) return instance.u2708();
		// seat
		if (":u1f4ba:".equals(name)) return instance.u1f4ba();
		if (":seat:".equals(name)) return instance.u1f4ba();
		// helicopter
		if (":u1f681:".equals(name)) return instance.u1f681();
		if (":helicopter:".equals(name)) return instance.u1f681();
		// steam locomotive
		if (":u1f682:".equals(name)) return instance.u1f682();
		if (":steam_locomotive:".equals(name)) return instance.u1f682();
		// tram
		if (":u1f68a:".equals(name)) return instance.u1f68a();
		if (":tram:".equals(name)) return instance.u1f68a();
		// station
		if (":u1f689:".equals(name)) return instance.u1f689();
		if (":station:".equals(name)) return instance.u1f689();
		// mountain railway
		if (":u1f69e:".equals(name)) return instance.u1f69e();
		if (":mountain_railway:".equals(name)) return instance.u1f69e();
		// train
		if (":u1f686:".equals(name)) return instance.u1f686();
		if (":train2:".equals(name)) return instance.u1f686();
		// high-speed train
		if (":u1f684:".equals(name)) return instance.u1f684();
		if (":bullettrain_side:".equals(name)) return instance.u1f684();
		// high-speed train with bullet nose
		if (":u1f685:".equals(name)) return instance.u1f685();
		if (":bullettrain_front:".equals(name)) return instance.u1f685();
		// light rail
		if (":u1f688:".equals(name)) return instance.u1f688();
		if (":light_rail:".equals(name)) return instance.u1f688();
		// metro
		if (":u1f687:".equals(name)) return instance.u1f687();
		if (":metro:".equals(name)) return instance.u1f687();
		// monorail
		if (":u1f69d:".equals(name)) return instance.u1f69d();
		if (":monorail:".equals(name)) return instance.u1f69d();
		// tram car
		if (":u1f68b:".equals(name)) return instance.u1f68b();
		if (":train:".equals(name)) return instance.u1f68b();
		// railway car
		if (":u1f683:".equals(name)) return instance.u1f683();
		if (":railway_car:".equals(name)) return instance.u1f683();
		// trolleybus
		if (":u1f68e:".equals(name)) return instance.u1f68e();
		if (":trolleybus:".equals(name)) return instance.u1f68e();
		// bus
		if (":u1f68c:".equals(name)) return instance.u1f68c();
		if (":bus:".equals(name)) return instance.u1f68c();
		// oncoming bus
		if (":u1f68d:".equals(name)) return instance.u1f68d();
		if (":oncoming_bus:".equals(name)) return instance.u1f68d();
		// recreational vehicle
		if (":u1f699:".equals(name)) return instance.u1f699();
		if (":blue_car:".equals(name)) return instance.u1f699();
		// oncoming automobile
		if (":u1f698:".equals(name)) return instance.u1f698();
		if (":oncoming_automobile:".equals(name)) return instance.u1f698();
		// automobile
		if (":u1f697:".equals(name)) return instance.u1f697();
		if (":car:".equals(name)) return instance.u1f697();
		if (":red_car:".equals(name)) return instance.u1f697();
		// taxi
		if (":u1f695:".equals(name)) return instance.u1f695();
		if (":taxi:".equals(name)) return instance.u1f695();
		// oncoming taxi
		if (":u1f696:".equals(name)) return instance.u1f696();
		if (":oncoming_taxi:".equals(name)) return instance.u1f696();
		// articulated lorry
		if (":u1f69b:".equals(name)) return instance.u1f69b();
		if (":articulated_lorry:".equals(name)) return instance.u1f69b();
		// delivery truck
		if (":u1f69a:".equals(name)) return instance.u1f69a();
		if (":truck:".equals(name)) return instance.u1f69a();
		// police cars revolving light
		if (":u1f6a8:".equals(name)) return instance.u1f6a8();
		if (":rotating_light:".equals(name)) return instance.u1f6a8();
		// police car
		if (":u1f693:".equals(name)) return instance.u1f693();
		if (":police_car:".equals(name)) return instance.u1f693();
		// oncoming police car
		if (":u1f694:".equals(name)) return instance.u1f694();
		if (":oncoming_police_car:".equals(name)) return instance.u1f694();
		// fire engine
		if (":u1f692:".equals(name)) return instance.u1f692();
		if (":fire_engine:".equals(name)) return instance.u1f692();
		// ambulance
		if (":u1f691:".equals(name)) return instance.u1f691();
		if (":ambulance:".equals(name)) return instance.u1f691();
		// minibus
		if (":u1f690:".equals(name)) return instance.u1f690();
		if (":minibus:".equals(name)) return instance.u1f690();
		// bicycle
		if (":u1f6b2:".equals(name)) return instance.u1f6b2();
		if (":bike:".equals(name)) return instance.u1f6b2();
		// aerial tramway
		if (":u1f6a1:".equals(name)) return instance.u1f6a1();
		if (":aerial_tramway:".equals(name)) return instance.u1f6a1();
		// suspension railway
		if (":u1f69f:".equals(name)) return instance.u1f69f();
		if (":suspension_railway:".equals(name)) return instance.u1f69f();
		// mountain cableway
		if (":u1f6a0:".equals(name)) return instance.u1f6a0();
		if (":mountain_cableway:".equals(name)) return instance.u1f6a0();
		// tractor
		if (":u1f69c:".equals(name)) return instance.u1f69c();
		if (":tractor:".equals(name)) return instance.u1f69c();
		// barber pole
		if (":u1f488:".equals(name)) return instance.u1f488();
		if (":barber:".equals(name)) return instance.u1f488();
		// bus stop
		if (":u1f68f:".equals(name)) return instance.u1f68f();
		if (":busstop:".equals(name)) return instance.u1f68f();
		// ticket
		if (":u1f3ab:".equals(name)) return instance.u1f3ab();
		if (":ticket:".equals(name)) return instance.u1f3ab();
		// vertical traffic light
		if (":u1f6a6:".equals(name)) return instance.u1f6a6();
		if (":vertical_traffic_light:".equals(name)) return instance.u1f6a6();
		// horizontal traffic light
		if (":u1f6a5:".equals(name)) return instance.u1f6a5();
		if (":traffic_light:".equals(name)) return instance.u1f6a5();
		// warning sign
		if (":u26a0:".equals(name)) return instance.u26a0();
		if (":warning:".equals(name)) return instance.u26a0();
		// construction sign
		if (":u1f6a7:".equals(name)) return instance.u1f6a7();
		if (":construction:".equals(name)) return instance.u1f6a7();
		// japanese symbol for beginner
		if (":u1f530:".equals(name)) return instance.u1f530();
		if (":beginner:".equals(name)) return instance.u1f530();
		// fuel pump
		if (":u26fd:".equals(name)) return instance.u26fd();
		if (":fuelpump:".equals(name)) return instance.u26fd();
		// izakaya lantern
		if (":u1f3ee:".equals(name)) return instance.u1f3ee();
		if (":izakaya_lantern:".equals(name)) return instance.u1f3ee();
		if (":lantern:".equals(name)) return instance.u1f3ee();
		// slot machine
		if (":u1f3b0:".equals(name)) return instance.u1f3b0();
		if (":slot_machine:".equals(name)) return instance.u1f3b0();
		// hot springs
		if (":u2668:".equals(name)) return instance.u2668();
		if (":hotsprings:".equals(name)) return instance.u2668();
		// moyai
		if (":u1f5ff:".equals(name)) return instance.u1f5ff();
		if (":moyai:".equals(name)) return instance.u1f5ff();
		// circus tent
		if (":u1f3aa:".equals(name)) return instance.u1f3aa();
		if (":circus_tent:".equals(name)) return instance.u1f3aa();
		// performing arts
		if (":u1f3ad:".equals(name)) return instance.u1f3ad();
		if (":performing_arts:".equals(name)) return instance.u1f3ad();
		// round pushpin
		if (":u1f4cd:".equals(name)) return instance.u1f4cd();
		if (":round_pushpin:".equals(name)) return instance.u1f4cd();
		// triangular flag on post
		if (":u1f6a9:".equals(name)) return instance.u1f6a9();
		if (":triangular_flag_on_post:".equals(name)) return instance.u1f6a9();
		// regional indicator symbol letter j + regional indicator symbol letter p
		if (":u1f1ef_1f1f5:".equals(name)) return instance.u1f1ef_1f1f5();
		if (":jp:".equals(name)) return instance.u1f1ef_1f1f5();
		// regional indicator symbol letter k + regional indicator symbol letter r
		if (":u1f1f0_1f1f7:".equals(name)) return instance.u1f1f0_1f1f7();
		if (":kr:".equals(name)) return instance.u1f1f0_1f1f7();
		// regional indicator symbol letter d + regional indicator symbol letter e
		if (":u1f1e9_1f1ea:".equals(name)) return instance.u1f1e9_1f1ea();
		if (":de:".equals(name)) return instance.u1f1e9_1f1ea();
		// regional indicator symbol letter c + regional indicator symbol letter n
		if (":u1f1e8_1f1f3:".equals(name)) return instance.u1f1e8_1f1f3();
		if (":cn:".equals(name)) return instance.u1f1e8_1f1f3();
		// regional indicator symbol letter u + regional indicator symbol letter s
		if (":u1f1fa_1f1f8:".equals(name)) return instance.u1f1fa_1f1f8();
		if (":us:".equals(name)) return instance.u1f1fa_1f1f8();
		// regional indicator symbol letter f + regional indicator symbol letter r
		if (":u1f1eb_1f1f7:".equals(name)) return instance.u1f1eb_1f1f7();
		if (":fr:".equals(name)) return instance.u1f1eb_1f1f7();
		// regional indicator symbol letter e + regional indicator symbol letter s
		if (":u1f1ea_1f1f8:".equals(name)) return instance.u1f1ea_1f1f8();
		if (":es:".equals(name)) return instance.u1f1ea_1f1f8();
		// regional indicator symbol letter i + regional indicator symbol letter t
		if (":u1f1ee_1f1f9:".equals(name)) return instance.u1f1ee_1f1f9();
		if (":it:".equals(name)) return instance.u1f1ee_1f1f9();
		// regional indicator symbol letter r + regional indicator symbol letter u
		if (":u1f1f7_1f1fa:".equals(name)) return instance.u1f1f7_1f1fa();
		if (":ru:".equals(name)) return instance.u1f1f7_1f1fa();
		// regional indicator symbol letter g + regional indicator symbol letter b
		if (":u1f1ec_1f1e7:".equals(name)) return instance.u1f1ec_1f1e7();
		if (":gb:".equals(name)) return instance.u1f1ec_1f1e7();
		if (":uk:".equals(name)) return instance.u1f1ec_1f1e7();
		// digit one + combining enclosing keycap
		if (":u0031_20e3:".equals(name)) return instance.u0031_20e3();
		if (":one:".equals(name)) return instance.u0031_20e3();
		// digit two + combining enclosing keycap
		if (":u0032_20e3:".equals(name)) return instance.u0032_20e3();
		if (":two:".equals(name)) return instance.u0032_20e3();
		// digit three + combining enclosing keycap
		if (":u0033_20e3:".equals(name)) return instance.u0033_20e3();
		if (":three:".equals(name)) return instance.u0033_20e3();
		// digit four + combining enclosing keycap
		if (":u0034_20e3:".equals(name)) return instance.u0034_20e3();
		if (":four:".equals(name)) return instance.u0034_20e3();
		// digit five + combining enclosing keycap
		if (":u0035_20e3:".equals(name)) return instance.u0035_20e3();
		if (":five:".equals(name)) return instance.u0035_20e3();
		// digit six + combining enclosing keycap
		if (":u0036_20e3:".equals(name)) return instance.u0036_20e3();
		if (":six:".equals(name)) return instance.u0036_20e3();
		// digit seven + combining enclosing keycap
		if (":u0037_20e3:".equals(name)) return instance.u0037_20e3();
		if (":seven:".equals(name)) return instance.u0037_20e3();
		// digit eight + combining enclosing keycap
		if (":u0038_20e3:".equals(name)) return instance.u0038_20e3();
		if (":eight:".equals(name)) return instance.u0038_20e3();
		// digit nine + combining enclosing keycap
		if (":u0039_20e3:".equals(name)) return instance.u0039_20e3();
		if (":nine:".equals(name)) return instance.u0039_20e3();
		// digit zero + combining enclosing keycap
		if (":u0030_20e3:".equals(name)) return instance.u0030_20e3();
		if (":zero:".equals(name)) return instance.u0030_20e3();
		// keycap ten
		if (":u1f51f:".equals(name)) return instance.u1f51f();
		if (":keycap_ten:".equals(name)) return instance.u1f51f();
		// input symbol for numbers
		if (":u1f522:".equals(name)) return instance.u1f522();
		if (":1234:".equals(name)) return instance.u1f522();
		// number sign + combining enclosing keycap
		if (":u0023_20e3:".equals(name)) return instance.u0023_20e3();
		if (":hash:".equals(name)) return instance.u0023_20e3();
		// input symbol for symbols
		if (":u1f523:".equals(name)) return instance.u1f523();
		if (":symbols:".equals(name)) return instance.u1f523();
		// upwards black arrow
		if (":u2b06:".equals(name)) return instance.u2b06();
		if (":arrow_up:".equals(name)) return instance.u2b06();
		// downwards black arrow
		if (":u2b07:".equals(name)) return instance.u2b07();
		if (":arrow_down:".equals(name)) return instance.u2b07();
		// leftwards black arrow
		if (":u2b05:".equals(name)) return instance.u2b05();
		if (":arrow_left:".equals(name)) return instance.u2b05();
		// black rightwards arrow
		if (":u27a1:".equals(name)) return instance.u27a1();
		if (":arrow_right:".equals(name)) return instance.u27a1();
		// input symbol for latin capital letters
		if (":u1f520:".equals(name)) return instance.u1f520();
		if (":capital_abcd:".equals(name)) return instance.u1f520();
		// input symbol for latin small letters
		if (":u1f521:".equals(name)) return instance.u1f521();
		if (":abcd:".equals(name)) return instance.u1f521();
		// input symbol for latin letters
		if (":u1f524:".equals(name)) return instance.u1f524();
		if (":abc:".equals(name)) return instance.u1f524();
		// north east arrow
		if (":u2197:".equals(name)) return instance.u2197();
		if (":arrow_upper_right:".equals(name)) return instance.u2197();
		// north west arrow
		if (":u2196:".equals(name)) return instance.u2196();
		if (":arrow_upper_left:".equals(name)) return instance.u2196();
		// south east arrow
		if (":u2198:".equals(name)) return instance.u2198();
		if (":arrow_lower_right:".equals(name)) return instance.u2198();
		// south west arrow
		if (":u2199:".equals(name)) return instance.u2199();
		if (":arrow_lower_left:".equals(name)) return instance.u2199();
		// left right arrow
		if (":u2194:".equals(name)) return instance.u2194();
		if (":left_right_arrow:".equals(name)) return instance.u2194();
		// up down arrow
		if (":u2195:".equals(name)) return instance.u2195();
		if (":arrow_up_down:".equals(name)) return instance.u2195();
		// anticlockwise downwards and upwards open circle arrows
		if (":u1f504:".equals(name)) return instance.u1f504();
		if (":arrows_counterclockwise:".equals(name)) return instance.u1f504();
		// black left-pointing triangle
		if (":u25c0:".equals(name)) return instance.u25c0();
		if (":arrow_backward:".equals(name)) return instance.u25c0();
		// black right-pointing triangle
		if (":u25b6:".equals(name)) return instance.u25b6();
		if (":arrow_forward:".equals(name)) return instance.u25b6();
		// up-pointing small red triangle
		if (":u1f53c:".equals(name)) return instance.u1f53c();
		if (":arrow_up_small:".equals(name)) return instance.u1f53c();
		// down-pointing small red triangle
		if (":u1f53d:".equals(name)) return instance.u1f53d();
		if (":arrow_down_small:".equals(name)) return instance.u1f53d();
		// leftwards arrow with hook
		if (":u21a9:".equals(name)) return instance.u21a9();
		if (":leftwards_arrow_with_hook:".equals(name)) return instance.u21a9();
		// rightwards arrow with hook
		if (":u21aa:".equals(name)) return instance.u21aa();
		if (":arrow_right_hook:".equals(name)) return instance.u21aa();
		// information source
		if (":u2139:".equals(name)) return instance.u2139();
		if (":information_source:".equals(name)) return instance.u2139();
		// black left-pointing double triangle
		if (":u23ea:".equals(name)) return instance.u23ea();
		if (":rewind:".equals(name)) return instance.u23ea();
		// black right-pointing double triangle
		if (":u23e9:".equals(name)) return instance.u23e9();
		if (":fast_forward:".equals(name)) return instance.u23e9();
		// black up-pointing double triangle
		if (":u23eb:".equals(name)) return instance.u23eb();
		if (":arrow_double_up:".equals(name)) return instance.u23eb();
		// black down-pointing double triangle
		if (":u23ec:".equals(name)) return instance.u23ec();
		if (":arrow_double_down:".equals(name)) return instance.u23ec();
		// arrow pointing rightwards then curving downwards
		if (":u2935:".equals(name)) return instance.u2935();
		if (":arrow_heading_down:".equals(name)) return instance.u2935();
		// arrow pointing rightwards then curving upwards
		if (":u2934:".equals(name)) return instance.u2934();
		if (":arrow_heading_up:".equals(name)) return instance.u2934();
		// squared ok
		if (":u1f197:".equals(name)) return instance.u1f197();
		if (":ok:".equals(name)) return instance.u1f197();
		// twisted rightwards arrows
		if (":u1f500:".equals(name)) return instance.u1f500();
		if (":twisted_rightwards_arrows:".equals(name))
			return instance.u1f500();
		// clockwise rightwards and leftwards open circle arrows
		if (":u1f501:".equals(name)) return instance.u1f501();
		if (":repeat:".equals(name)) return instance.u1f501();
		// clockwise rightwards and leftwards open circle arrows with circled one overlay
		if (":u1f502:".equals(name)) return instance.u1f502();
		if (":repeat_one:".equals(name)) return instance.u1f502();
		// squared new
		if (":u1f195:".equals(name)) return instance.u1f195();
		if (":new:".equals(name)) return instance.u1f195();
		// squared up with exclamation mark
		if (":u1f199:".equals(name)) return instance.u1f199();
		if (":up:".equals(name)) return instance.u1f199();
		// squared cool
		if (":u1f192:".equals(name)) return instance.u1f192();
		if (":cool:".equals(name)) return instance.u1f192();
		// squared free
		if (":u1f193:".equals(name)) return instance.u1f193();
		if (":free:".equals(name)) return instance.u1f193();
		// squared ng
		if (":u1f196:".equals(name)) return instance.u1f196();
		if (":ng:".equals(name)) return instance.u1f196();
		// antenna with bars
		if (":u1f4f6:".equals(name)) return instance.u1f4f6();
		if (":signal_strength:".equals(name)) return instance.u1f4f6();
		// cinema
		if (":u1f3a6:".equals(name)) return instance.u1f3a6();
		if (":cinema:".equals(name)) return instance.u1f3a6();
		// squared katakana koko
		if (":u1f201:".equals(name)) return instance.u1f201();
		if (":koko:".equals(name)) return instance.u1f201();
		// squared cjk unified ideograph-6307
		if (":u1f22f:".equals(name)) return instance.u1f22f();
		if (":u6307:".equals(name)) return instance.u1f22f();
		// squared cjk unified ideograph-7a7a
		if (":u1f233:".equals(name)) return instance.u1f233();
		if (":u7a7a:".equals(name)) return instance.u1f233();
		// squared cjk unified ideograph-6e80
		if (":u1f235:".equals(name)) return instance.u1f235();
		if (":u6e80:".equals(name)) return instance.u1f235();
		// squared cjk unified ideograph-5408
		if (":u1f234:".equals(name)) return instance.u1f234();
		if (":u5408:".equals(name)) return instance.u1f234();
		// squared cjk unified ideograph-7981
		if (":u1f232:".equals(name)) return instance.u1f232();
		if (":u7981:".equals(name)) return instance.u1f232();
		// circled ideograph advantage
		if (":u1f250:".equals(name)) return instance.u1f250();
		if (":ideograph_advantage:".equals(name)) return instance.u1f250();
		// squared cjk unified ideograph-5272
		if (":u1f239:".equals(name)) return instance.u1f239();
		if (":u5272:".equals(name)) return instance.u1f239();
		// squared cjk unified ideograph-55b6
		if (":u1f23a:".equals(name)) return instance.u1f23a();
		if (":u55b6:".equals(name)) return instance.u1f23a();
		// squared cjk unified ideograph-6709
		if (":u1f236:".equals(name)) return instance.u1f236();
		if (":u6709:".equals(name)) return instance.u1f236();
		// squared cjk unified ideograph-7121
		if (":u1f21a:".equals(name)) return instance.u1f21a();
		if (":u7121:".equals(name)) return instance.u1f21a();
		// restroom
		if (":u1f6bb:".equals(name)) return instance.u1f6bb();
		if (":restroom:".equals(name)) return instance.u1f6bb();
		// mens symbol
		if (":u1f6b9:".equals(name)) return instance.u1f6b9();
		if (":mens:".equals(name)) return instance.u1f6b9();
		// womens symbol
		if (":u1f6ba:".equals(name)) return instance.u1f6ba();
		if (":womens:".equals(name)) return instance.u1f6ba();
		// baby symbol
		if (":u1f6bc:".equals(name)) return instance.u1f6bc();
		if (":baby_symbol:".equals(name)) return instance.u1f6bc();
		// water closet
		if (":u1f6be:".equals(name)) return instance.u1f6be();
		if (":wc:".equals(name)) return instance.u1f6be();
		// potable water symbol
		if (":u1f6b0:".equals(name)) return instance.u1f6b0();
		if (":potable_water:".equals(name)) return instance.u1f6b0();
		// put litter in its place symbol
		if (":u1f6ae:".equals(name)) return instance.u1f6ae();
		if (":put_litter_in_its_place:".equals(name)) return instance.u1f6ae();
		// negative squared latin capital letter p
		if (":u1f17f:".equals(name)) return instance.u1f17f();
		if (":parking:".equals(name)) return instance.u1f17f();
		// wheelchair symbol
		if (":u267f:".equals(name)) return instance.u267f();
		if (":wheelchair:".equals(name)) return instance.u267f();
		// no smoking symbol
		if (":u1f6ad:".equals(name)) return instance.u1f6ad();
		if (":no_smoking:".equals(name)) return instance.u1f6ad();
		// squared cjk unified ideograph-6708
		if (":u1f237:".equals(name)) return instance.u1f237();
		if (":u6708:".equals(name)) return instance.u1f237();
		// squared cjk unified ideograph-7533
		if (":u1f238:".equals(name)) return instance.u1f238();
		if (":u7533:".equals(name)) return instance.u1f238();
		// squared katakana sa
		if (":u1f202:".equals(name)) return instance.u1f202();
		if (":sa:".equals(name)) return instance.u1f202();
		// circled latin capital letter m
		if (":u24c2:".equals(name)) return instance.u24c2();
		if (":m:".equals(name)) return instance.u24c2();
		// passport control
		if (":u1f6c2:".equals(name)) return instance.u1f6c2();
		if (":passport_control:".equals(name)) return instance.u1f6c2();
		// baggage claim
		if (":u1f6c4:".equals(name)) return instance.u1f6c4();
		if (":baggage_claim:".equals(name)) return instance.u1f6c4();
		// left luggage
		if (":u1f6c5:".equals(name)) return instance.u1f6c5();
		if (":left_luggage:".equals(name)) return instance.u1f6c5();
		// customs
		if (":u1f6c3:".equals(name)) return instance.u1f6c3();
		if (":customs:".equals(name)) return instance.u1f6c3();
		// circled ideograph accept
		if (":u1f251:".equals(name)) return instance.u1f251();
		if (":accept:".equals(name)) return instance.u1f251();
		// circled ideograph secret
		if (":u3299:".equals(name)) return instance.u3299();
		if (":secret:".equals(name)) return instance.u3299();
		// circled ideograph congratulation
		if (":u3297:".equals(name)) return instance.u3297();
		if (":congratulations:".equals(name)) return instance.u3297();
		// squared cl
		if (":u1f191:".equals(name)) return instance.u1f191();
		if (":cl:".equals(name)) return instance.u1f191();
		// squared sos
		if (":u1f198:".equals(name)) return instance.u1f198();
		if (":sos:".equals(name)) return instance.u1f198();
		// squared id
		if (":u1f194:".equals(name)) return instance.u1f194();
		if (":id:".equals(name)) return instance.u1f194();
		// no entry sign
		if (":u1f6ab:".equals(name)) return instance.u1f6ab();
		if (":no_entry_sign:".equals(name)) return instance.u1f6ab();
		// no one under eighteen symbol
		if (":u1f51e:".equals(name)) return instance.u1f51e();
		if (":underage:".equals(name)) return instance.u1f51e();
		// no mobile phones
		if (":u1f4f5:".equals(name)) return instance.u1f4f5();
		if (":no_mobile_phones:".equals(name)) return instance.u1f4f5();
		// do not litter symbol
		if (":u1f6af:".equals(name)) return instance.u1f6af();
		if (":do_not_litter:".equals(name)) return instance.u1f6af();
		// non-potable water symbol
		if (":u1f6b1:".equals(name)) return instance.u1f6b1();
		if (":non-potable_water:".equals(name)) return instance.u1f6b1();
		// no bicycles
		if (":u1f6b3:".equals(name)) return instance.u1f6b3();
		if (":no_bicycles:".equals(name)) return instance.u1f6b3();
		// no pedestrians
		if (":u1f6b7:".equals(name)) return instance.u1f6b7();
		if (":no_pedestrians:".equals(name)) return instance.u1f6b7();
		// children crossing
		if (":u1f6b8:".equals(name)) return instance.u1f6b8();
		if (":children_crossing:".equals(name)) return instance.u1f6b8();
		// no entry
		if (":u26d4:".equals(name)) return instance.u26d4();
		if (":no_entry:".equals(name)) return instance.u26d4();
		// eight spoked asterisk
		if (":u2733:".equals(name)) return instance.u2733();
		if (":eight_spoked_asterisk:".equals(name)) return instance.u2733();
		// sparkle
		if (":u2747:".equals(name)) return instance.u2747();
		if (":sparkle:".equals(name)) return instance.u2747();
		// negative squared cross mark
		if (":u274e:".equals(name)) return instance.u274e();
		if (":negative_squared_cross_mark:".equals(name))
			return instance.u274e();
		// white heavy check mark
		if (":u2705:".equals(name)) return instance.u2705();
		if (":white_check_mark:".equals(name)) return instance.u2705();
		// eight pointed black star
		if (":u2734:".equals(name)) return instance.u2734();
		if (":eight_pointed_black_star:".equals(name)) return instance.u2734();
		// heart decoration
		if (":u1f49f:".equals(name)) return instance.u1f49f();
		if (":heart_decoration:".equals(name)) return instance.u1f49f();
		// squared vs
		if (":u1f19a:".equals(name)) return instance.u1f19a();
		if (":vs:".equals(name)) return instance.u1f19a();
		// vibration mode
		if (":u1f4f3:".equals(name)) return instance.u1f4f3();
		if (":vibration_mode:".equals(name)) return instance.u1f4f3();
		// mobile phone off
		if (":u1f4f4:".equals(name)) return instance.u1f4f4();
		if (":mobile_phone_off:".equals(name)) return instance.u1f4f4();
		// negative squared latin capital letter a
		if (":u1f170:".equals(name)) return instance.u1f170();
		if (":a:".equals(name)) return instance.u1f170();
		// negative squared latin capital letter b
		if (":u1f171:".equals(name)) return instance.u1f171();
		if (":b:".equals(name)) return instance.u1f171();
		// negative squared ab
		if (":u1f18e:".equals(name)) return instance.u1f18e();
		if (":ab:".equals(name)) return instance.u1f18e();
		// negative squared latin capital letter o
		if (":u1f17e:".equals(name)) return instance.u1f17e();
		if (":o2:".equals(name)) return instance.u1f17e();
		// diamond shape with a dot inside
		if (":u1f4a0:".equals(name)) return instance.u1f4a0();
		if (":diamond_shape_with_a_dot_inside:".equals(name))
			return instance.u1f4a0();
		// double curly loop
		if (":u27bf:".equals(name)) return instance.u27bf();
		if (":loop:".equals(name)) return instance.u27bf();
		// black universal recycling symbol
		if (":u267b:".equals(name)) return instance.u267b();
		if (":recycle:".equals(name)) return instance.u267b();
		// aries
		if (":u2648:".equals(name)) return instance.u2648();
		if (":aries:".equals(name)) return instance.u2648();
		// taurus
		if (":u2649:".equals(name)) return instance.u2649();
		if (":taurus:".equals(name)) return instance.u2649();
		// gemini
		if (":u264a:".equals(name)) return instance.u264a();
		if (":gemini:".equals(name)) return instance.u264a();
		// cancer
		if (":u264b:".equals(name)) return instance.u264b();
		if (":cancer:".equals(name)) return instance.u264b();
		// leo
		if (":u264c:".equals(name)) return instance.u264c();
		if (":leo:".equals(name)) return instance.u264c();
		// virgo
		if (":u264d:".equals(name)) return instance.u264d();
		if (":virgo:".equals(name)) return instance.u264d();
		// libra
		if (":u264e:".equals(name)) return instance.u264e();
		if (":libra:".equals(name)) return instance.u264e();
		// scorpius
		if (":u264f:".equals(name)) return instance.u264f();
		if (":scorpius:".equals(name)) return instance.u264f();
		// sagittarius
		if (":u2650:".equals(name)) return instance.u2650();
		if (":sagittarius:".equals(name)) return instance.u2650();
		// capricorn
		if (":u2651:".equals(name)) return instance.u2651();
		if (":capricorn:".equals(name)) return instance.u2651();
		// aquarius
		if (":u2652:".equals(name)) return instance.u2652();
		if (":aquarius:".equals(name)) return instance.u2652();
		// pisces
		if (":u2653:".equals(name)) return instance.u2653();
		if (":pisces:".equals(name)) return instance.u2653();
		// ophiuchus
		if (":u26ce:".equals(name)) return instance.u26ce();
		if (":ophiuchus:".equals(name)) return instance.u26ce();
		// six pointed star with middle dot
		if (":u1f52f:".equals(name)) return instance.u1f52f();
		if (":six_pointed_star:".equals(name)) return instance.u1f52f();
		// automated teller machine
		if (":u1f3e7:".equals(name)) return instance.u1f3e7();
		if (":atm:".equals(name)) return instance.u1f3e7();
		// chart with upwards trend and yen sign
		if (":u1f4b9:".equals(name)) return instance.u1f4b9();
		if (":chart:".equals(name)) return instance.u1f4b9();
		// heavy dollar sign
		if (":u1f4b2:".equals(name)) return instance.u1f4b2();
		if (":heavy_dollar_sign:".equals(name)) return instance.u1f4b2();
		// currency exchange
		if (":u1f4b1:".equals(name)) return instance.u1f4b1();
		if (":currency_exchange:".equals(name)) return instance.u1f4b1();
		// copyright sign
		if (":u00a9:".equals(name)) return instance.u00a9();
		if (":copyright:".equals(name)) return instance.u00a9();
		// registered sign
		if (":u00ae:".equals(name)) return instance.u00ae();
		if (":registered:".equals(name)) return instance.u00ae();
		// trade mark sign
		if (":u2122:".equals(name)) return instance.u2122();
		if (":tm:".equals(name)) return instance.u2122();
		// cross mark
		if (":u274c:".equals(name)) return instance.u274c();
		if (":x:".equals(name)) return instance.u274c();
		// double exclamation mark
		if (":u203c:".equals(name)) return instance.u203c();
		if (":bangbang:".equals(name)) return instance.u203c();
		// exclamation question mark
		if (":u2049:".equals(name)) return instance.u2049();
		if (":interrobang:".equals(name)) return instance.u2049();
		// heavy exclamation mark symbol
		if (":u2757:".equals(name)) return instance.u2757();
		if (":exclamation:".equals(name)) return instance.u2757();
		if (":heavy_exclamation_mark:".equals(name)) return instance.u2757();
		// black question mark ornament
		if (":u2753:".equals(name)) return instance.u2753();
		if (":question:".equals(name)) return instance.u2753();
		// white exclamation mark ornament
		if (":u2755:".equals(name)) return instance.u2755();
		if (":grey_exclamation:".equals(name)) return instance.u2755();
		// white question mark ornament
		if (":u2754:".equals(name)) return instance.u2754();
		if (":grey_question:".equals(name)) return instance.u2754();
		// heavy large circle
		if (":u2b55:".equals(name)) return instance.u2b55();
		if (":o:".equals(name)) return instance.u2b55();
		// top with upwards arrow above
		if (":u1f51d:".equals(name)) return instance.u1f51d();
		if (":top:".equals(name)) return instance.u1f51d();
		// end with leftwards arrow above
		if (":u1f51a:".equals(name)) return instance.u1f51a();
		if (":end:".equals(name)) return instance.u1f51a();
		// back with leftwards arrow above
		if (":u1f519:".equals(name)) return instance.u1f519();
		if (":back:".equals(name)) return instance.u1f519();
		// on with exclamation mark with left right arrow above
		if (":u1f51b:".equals(name)) return instance.u1f51b();
		if (":on:".equals(name)) return instance.u1f51b();
		// soon with rightwards arrow above
		if (":u1f51c:".equals(name)) return instance.u1f51c();
		if (":soon:".equals(name)) return instance.u1f51c();
		// clockwise downwards and upwards open circle arrows
		if (":u1f503:".equals(name)) return instance.u1f503();
		if (":arrows_clockwise:".equals(name)) return instance.u1f503();
		// clock face twelve oclock
		if (":u1f55b:".equals(name)) return instance.u1f55b();
		if (":clock12:".equals(name)) return instance.u1f55b();
		// clock face twelve-thirty
		if (":u1f567:".equals(name)) return instance.u1f567();
		if (":clock1230:".equals(name)) return instance.u1f567();
		// clock face one oclock
		if (":u1f550:".equals(name)) return instance.u1f550();
		if (":clock1:".equals(name)) return instance.u1f550();
		// clock face one-thirty
		if (":u1f55c:".equals(name)) return instance.u1f55c();
		if (":clock130:".equals(name)) return instance.u1f55c();
		// clock face two oclock
		if (":u1f551:".equals(name)) return instance.u1f551();
		if (":clock2:".equals(name)) return instance.u1f551();
		// clock face two-thirty
		if (":u1f55d:".equals(name)) return instance.u1f55d();
		if (":clock230:".equals(name)) return instance.u1f55d();
		// clock face three oclock
		if (":u1f552:".equals(name)) return instance.u1f552();
		if (":clock3:".equals(name)) return instance.u1f552();
		// clock face three-thirty
		if (":u1f55e:".equals(name)) return instance.u1f55e();
		if (":clock330:".equals(name)) return instance.u1f55e();
		// clock face four oclock
		if (":u1f553:".equals(name)) return instance.u1f553();
		if (":clock4:".equals(name)) return instance.u1f553();
		// clock face four-thirty
		if (":u1f55f:".equals(name)) return instance.u1f55f();
		if (":clock430:".equals(name)) return instance.u1f55f();
		// clock face five oclock
		if (":u1f554:".equals(name)) return instance.u1f554();
		if (":clock5:".equals(name)) return instance.u1f554();
		// clock face five-thirty
		if (":u1f560:".equals(name)) return instance.u1f560();
		if (":clock530:".equals(name)) return instance.u1f560();
		// clock face six oclock
		if (":u1f555:".equals(name)) return instance.u1f555();
		if (":clock6:".equals(name)) return instance.u1f555();
		// clock face seven oclock
		if (":u1f556:".equals(name)) return instance.u1f556();
		if (":clock7:".equals(name)) return instance.u1f556();
		// clock face eight oclock
		if (":u1f557:".equals(name)) return instance.u1f557();
		if (":clock8:".equals(name)) return instance.u1f557();
		// clock face nine oclock
		if (":u1f558:".equals(name)) return instance.u1f558();
		if (":clock9:".equals(name)) return instance.u1f558();
		// clock face ten oclock
		if (":u1f559:".equals(name)) return instance.u1f559();
		if (":clock10:".equals(name)) return instance.u1f559();
		// clock face eleven oclock
		if (":u1f55a:".equals(name)) return instance.u1f55a();
		if (":clock11:".equals(name)) return instance.u1f55a();
		// clock face six-thirty
		if (":u1f561:".equals(name)) return instance.u1f561();
		if (":clock630:".equals(name)) return instance.u1f561();
		// clock face seven-thirty
		if (":u1f562:".equals(name)) return instance.u1f562();
		if (":clock730:".equals(name)) return instance.u1f562();
		// clock face eight-thirty
		if (":u1f563:".equals(name)) return instance.u1f563();
		if (":clock830:".equals(name)) return instance.u1f563();
		// clock face nine-thirty
		if (":u1f564:".equals(name)) return instance.u1f564();
		if (":clock930:".equals(name)) return instance.u1f564();
		// clock face ten-thirty
		if (":u1f565:".equals(name)) return instance.u1f565();
		if (":clock1030:".equals(name)) return instance.u1f565();
		// clock face eleven-thirty
		if (":u1f566:".equals(name)) return instance.u1f566();
		if (":clock1130:".equals(name)) return instance.u1f566();
		// heavy multiplication x
		if (":u2716:".equals(name)) return instance.u2716();
		if (":heavy_multiplication_x:".equals(name)) return instance.u2716();
		// heavy plus sign
		if (":u2795:".equals(name)) return instance.u2795();
		if (":heavy_plus_sign:".equals(name)) return instance.u2795();
		// heavy minus sign
		if (":u2796:".equals(name)) return instance.u2796();
		if (":heavy_minus_sign:".equals(name)) return instance.u2796();
		// heavy division sign
		if (":u2797:".equals(name)) return instance.u2797();
		if (":heavy_division_sign:".equals(name)) return instance.u2797();
		// black spade suit
		if (":u2660:".equals(name)) return instance.u2660();
		if (":spades:".equals(name)) return instance.u2660();
		// black heart suit
		if (":u2665:".equals(name)) return instance.u2665();
		if (":hearts:".equals(name)) return instance.u2665();
		// black club suit
		if (":u2663:".equals(name)) return instance.u2663();
		if (":clubs:".equals(name)) return instance.u2663();
		// black diamond suit
		if (":u2666:".equals(name)) return instance.u2666();
		if (":diamonds:".equals(name)) return instance.u2666();
		// white flower
		if (":u1f4ae:".equals(name)) return instance.u1f4ae();
		if (":white_flower:".equals(name)) return instance.u1f4ae();
		// hundred points symbol
		if (":u1f4af:".equals(name)) return instance.u1f4af();
		if (":100:".equals(name)) return instance.u1f4af();
		// heavy check mark
		if (":u2714:".equals(name)) return instance.u2714();
		if (":heavy_check_mark:".equals(name)) return instance.u2714();
		// ballot box with check
		if (":u2611:".equals(name)) return instance.u2611();
		if (":ballot_box_with_check:".equals(name)) return instance.u2611();
		// radio button
		if (":u1f518:".equals(name)) return instance.u1f518();
		if (":radio_button:".equals(name)) return instance.u1f518();
		// link symbol
		if (":u1f517:".equals(name)) return instance.u1f517();
		if (":link:".equals(name)) return instance.u1f517();
		// curly loop
		if (":u27b0:".equals(name)) return instance.u27b0();
		if (":curly_loop:".equals(name)) return instance.u27b0();
		// wavy dash
		if (":u3030:".equals(name)) return instance.u3030();
		if (":wavy_dash:".equals(name)) return instance.u3030();
		// part alternation mark
		if (":u303d:".equals(name)) return instance.u303d();
		if (":part_alternation_mark:".equals(name)) return instance.u303d();
		// trident emblem
		if (":u1f531:".equals(name)) return instance.u1f531();
		if (":trident:".equals(name)) return instance.u1f531();
		// black medium square
		if (":u25fc:".equals(name)) return instance.u25fc();
		if (":black_medium_square:".equals(name)) return instance.u25fc();
		// white medium square
		if (":u25fb:".equals(name)) return instance.u25fb();
		if (":white_medium_square:".equals(name)) return instance.u25fb();
		// black medium small square
		if (":u25fe:".equals(name)) return instance.u25fe();
		if (":black_medium_small_square:".equals(name)) return instance.u25fe();
		// white medium small square
		if (":u25fd:".equals(name)) return instance.u25fd();
		if (":white_medium_small_square:".equals(name)) return instance.u25fd();
		// black small square
		if (":u25aa:".equals(name)) return instance.u25aa();
		if (":black_small_square:".equals(name)) return instance.u25aa();
		// white small square
		if (":u25ab:".equals(name)) return instance.u25ab();
		if (":white_small_square:".equals(name)) return instance.u25ab();
		// up-pointing red triangle
		if (":u1f53a:".equals(name)) return instance.u1f53a();
		if (":small_red_triangle:".equals(name)) return instance.u1f53a();
		// black square button
		if (":u1f532:".equals(name)) return instance.u1f532();
		if (":black_square_button:".equals(name)) return instance.u1f532();
		// white square button
		if (":u1f533:".equals(name)) return instance.u1f533();
		if (":white_square_button:".equals(name)) return instance.u1f533();
		// medium black circle
		if (":u26ab:".equals(name)) return instance.u26ab();
		if (":black_circle:".equals(name)) return instance.u26ab();
		// medium white circle
		if (":u26aa:".equals(name)) return instance.u26aa();
		if (":white_circle:".equals(name)) return instance.u26aa();
		// large red circle
		if (":u1f534:".equals(name)) return instance.u1f534();
		if (":red_circle:".equals(name)) return instance.u1f534();
		// large blue circle
		if (":u1f535:".equals(name)) return instance.u1f535();
		if (":large_blue_circle:".equals(name)) return instance.u1f535();
		// down-pointing red triangle
		if (":u1f53b:".equals(name)) return instance.u1f53b();
		if (":small_red_triangle_down:".equals(name)) return instance.u1f53b();
		// white large square
		if (":u2b1c:".equals(name)) return instance.u2b1c();
		if (":white_large_square:".equals(name)) return instance.u2b1c();
		// black large square
		if (":u2b1b:".equals(name)) return instance.u2b1b();
		if (":black_large_square:".equals(name)) return instance.u2b1b();
		// large orange diamond
		if (":u1f536:".equals(name)) return instance.u1f536();
		if (":large_orange_diamond:".equals(name)) return instance.u1f536();
		// large blue diamond
		if (":u1f537:".equals(name)) return instance.u1f537();
		if (":large_blue_diamond:".equals(name)) return instance.u1f537();
		// small orange diamond
		if (":u1f538:".equals(name)) return instance.u1f538();
		if (":small_orange_diamond:".equals(name)) return instance.u1f538();
		// small blue diamond
		if (":u1f539:".equals(name)) return instance.u1f539();
		if (":small_blue_diamond:".equals(name)) return instance.u1f539();
		return null;
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

	public Collection<String> keyWords () {
		if (keywords == null) {
			keywords = Collections.unmodifiableList(Arrays.asList(":u1f604:",
					":smile:",
					// smiling face with open mouth
					":u1f603:", ":smiley:",
					// grinning face
					":u1f600:", ":grinning:",
					// smiling face with smiling eyes
					":u1f60a:", ":blush:",
					// white smiling face
					":u263a:", ":relaxed:",
					// winking face
					":u1f609:", ":wink:",
					// smiling face with heart-shaped eyes
					":u1f60d:", ":heart_eyes:",
					// face throwing a kiss
					":u1f618:", ":kissing_heart:",
					// kissing face with closed eyes
					":u1f61a:", ":kissing_closed_eyes:",
					// kissing face
					":u1f617:", ":kissing:",
					// kissing face with smiling eyes
					":u1f619:", ":kissing_smiling_eyes:",
					// face with stuck-out tongue and winking eye
					":u1f61c:", ":stuck_out_tongue_winking_eye:",
					// face with stuck-out tongue and tightly-closed eyes
					":u1f61d:", ":stuck_out_tongue_closed_eyes:",
					// face with stuck-out tongue
					":u1f61b:", ":stuck_out_tongue:",
					// flushed face
					":u1f633:", ":flushed:",
					// grinning face with smiling eyes
					":u1f601:", ":grin:",
					// pensive face
					":u1f614:", ":pensive:",
					// relieved face
					":u1f60c:", ":relieved:",
					// unamused face
					":u1f612:", ":unamused:",
					// disappointed face
					":u1f61e:", ":disappointed:",
					// persevering face
					":u1f623:", ":persevere:",
					// crying face
					":u1f622:", ":cry:",
					// face with tears of joy
					":u1f602:", ":joy:",
					// loudly crying face
					":u1f62d:", ":sob:",
					// sleepy face
					":u1f62a:", ":sleepy:",
					// disappointed but relieved face
					":u1f625:", ":disappointed_relieved:",
					// face with open mouth and cold sweat
					":u1f630:", ":cold_sweat:",
					// smiling face with open mouth and cold sweat
					":u1f605:", ":sweat_smile:",
					// face with cold sweat
					":u1f613:", ":sweat:",
					// weary face
					":u1f629:", ":weary:",
					// tired face
					":u1f62b:", ":tired_face:",
					// fearful face
					":u1f628:", ":fearful:",
					// face screaming in fear
					":u1f631:", ":scream:",
					// angry face
					":u1f620:", ":angry:",
					// pouting face
					":u1f621:", ":rage:",
					// face with look of triumph
					":u1f624:", ":triumph:",
					// confounded face
					":u1f616:", ":confounded:",
					// smiling face with open mouth and tightly-closed eyes
					":u1f606:", ":laughing:", ":satisfied:",
					// face savouring delicious food
					":u1f60b:", ":yum:",
					// face with medical mask
					":u1f637:", ":mask:",
					// smiling face with sunglasses
					":u1f60e:", ":sunglasses:",
					// sleeping face
					":u1f634:", ":sleeping:",
					// dizzy face
					":u1f635:", ":dizzy_face:",
					// astonished face
					":u1f632:", ":astonished:",
					// worried face
					":u1f61f:", ":worried:",
					// frowning face with open mouth
					":u1f626:", ":frowning:",
					// anguished face
					":u1f627:", ":anguished:",
					// smiling face with horns
					":u1f608:", ":smiling_imp:",
					// imp
					":u1f47f:", ":imp:",
					// face with open mouth
					":u1f62e:", ":open_mouth:",
					// grimacing face
					":u1f62c:", ":grimacing:",
					// neutral face
					":u1f610:", ":neutral_face:",
					// confused face
					":u1f615:", ":confused:",
					// hushed face
					":u1f62f:", ":hushed:",
					// face without mouth
					":u1f636:", ":no_mouth:",
					// smiling face with halo
					":u1f607:", ":innocent:",
					// smirking face
					":u1f60f:", ":smirk:",
					// expressionless face
					":u1f611:", ":expressionless:",
					// man with gua pi mao
					":u1f472:", ":man_with_gua_pi_mao:",
					// man with turban
					":u1f473:", ":man_with_turban:",
					// police officer
					":u1f46e:", ":cop:",
					// construction worker
					":u1f477:", ":construction_worker:",
					// guardsman
					":u1f482:", ":guardsman:",
					// baby
					":u1f476:", ":baby:",
					// boy
					":u1f466:", ":boy:",
					// girl
					":u1f467:", ":girl:",
					// man
					":u1f468:", ":man:",
					// woman
					":u1f469:", ":woman:",
					// older man
					":u1f474:", ":older_man:",
					// older woman
					":u1f475:", ":older_woman:",
					// person with blond hair
					":u1f471:", ":person_with_blond_hair:",
					// baby angel
					":u1f47c:", ":angel:",
					// princess
					":u1f478:", ":princess:",
					// smiling cat face with open mouth
					":u1f63a:", ":smiley_cat:",
					// grinning cat face with smiling eyes
					":u1f638:", ":smile_cat:",
					// smiling cat face with heart-shaped eyes
					":u1f63b:", ":heart_eyes_cat:",
					// kissing cat face with closed eyes
					":u1f63d:", ":kissing_cat:",
					// cat face with wry smile
					":u1f63c:", ":smirk_cat:",
					// weary cat face
					":u1f640:", ":scream_cat:",
					// crying cat face
					":u1f63f:", ":crying_cat_face:",
					// cat face with tears of joy
					":u1f639:", ":joy_cat:",
					// pouting cat face
					":u1f63e:", ":pouting_cat:",
					// japanese ogre
					":u1f479:", ":japanese_ogre:",
					// japanese goblin
					":u1f47a:", ":japanese_goblin:",
					// see-no-evil monkey
					":u1f648:", ":see_no_evil:",
					// hear-no-evil monkey
					":u1f649:", ":hear_no_evil:",
					// speak-no-evil monkey
					":u1f64a:", ":speak_no_evil:",
					// skull
					":u1f480:", ":skull:",
					// extraterrestrial alien
					":u1f47d:", ":alien:",
					// pile of poo
					":u1f4a9:", ":hankey:", ":poop:", ":shit:",
					// fire
					":u1f525:", ":fire:",
					// sparkles
					":u2728:", ":sparkles:",
					// glowing star
					":u1f31f:", ":star2:",
					// dizzy symbol
					":u1f4ab:", ":dizzy:",
					// collision symbol
					":u1f4a5:", ":boom:", ":collision:",
					// anger symbol
					":u1f4a2:", ":anger:",
					// splashing sweat symbol
					":u1f4a6:", ":sweat_drops:",
					// droplet
					":u1f4a7:", ":droplet:",
					// sleeping symbol
					":u1f4a4:", ":zzz:",
					// dash symbol
					":u1f4a8:", ":dash:",
					// ear
					":u1f442:", ":ear:",
					// eyes
					":u1f440:", ":eyes:",
					// nose
					":u1f443:", ":nose:",
					// tongue
					":u1f445:", ":tongue:",
					// mouth
					":u1f444:", ":lips:",
					// thumbs up sign
					":u1f44d:", ":+1:", ":thumbsup:",
					// thumbs down sign
					":u1f44e:", ":-1:", ":thumbsdown:",
					// ok hand sign
					":u1f44c:", ":ok_hand:",
					// fisted hand sign
					":u1f44a:", ":facepunch:", ":punch:",
					// raised fist
					":u270a:", ":fist:",
					// victory hand
					":u270c:", ":v:",
					// waving hand sign
					":u1f44b:", ":wave:",
					// raised hand
					":u270b:", ":hand:", ":raised_hand:",
					// open hands sign
					":u1f450:", ":open_hands:",
					// white up pointing backhand index
					":u1f446:", ":point_up_2:",
					// white down pointing backhand index
					":u1f447:", ":point_down:",
					// white right pointing backhand index
					":u1f449:", ":point_right:",
					// white left pointing backhand index
					":u1f448:", ":point_left:",
					// person raising both hands in celebration
					":u1f64c:", ":raised_hands:",
					// person with folded hands
					":u1f64f:", ":pray:",
					// white up pointing index
					":u261d:", ":point_up:",
					// clapping hands sign
					":u1f44f:", ":clap:",
					// flexed biceps
					":u1f4aa:", ":muscle:",
					// pedestrian
					":u1f6b6:", ":walking:",
					// runner
					":u1f3c3:", ":runner:", ":running:",
					// dancer
					":u1f483:", ":dancer:",
					// man and woman holding hands
					":u1f46b:", ":couple:",
					// family
					":u1f46a:", ":family:",
					// two men holding hands
					":u1f46c:", ":two_men_holding_hands:",
					// two women holding hands
					":u1f46d:", ":two_women_holding_hands:",
					// kiss
					":u1f48f:", ":couplekiss:",
					// couple with heart
					":u1f491:", ":couple_with_heart:",
					// woman with bunny ears
					":u1f46f:", ":dancers:",
					// face with ok gesture
					":u1f646:", ":ok_woman:",
					// face with no good gesture
					":u1f645:", ":no_good:",
					// information desk person
					":u1f481:", ":information_desk_person:",
					// happy person raising one hand
					":u1f64b:", ":raising_hand:",
					// face massage
					":u1f486:", ":massage:",
					// haircut
					":u1f487:", ":haircut:",
					// nail polish
					":u1f485:", ":nail_care:",
					// bride with veil
					":u1f470:", ":bride_with_veil:",
					// person with pouting face
					":u1f64e:", ":person_with_pouting_face:",
					// person frowning
					":u1f64d:", ":person_frowning:",
					// person bowing deeply
					":u1f647:", ":bow:",
					// top hat
					":u1f3a9:", ":tophat:",
					// crown
					":u1f451:", ":crown:",
					// womans hat
					":u1f452:", ":womans_hat:",
					// athletic shoe
					":u1f45f:", ":athletic_shoe:",
					// mans shoe
					":u1f45e:", ":mans_shoe:", ":shoe:",
					// womans sandal
					":u1f461:", ":sandal:",
					// high-heeled shoe
					":u1f460:", ":high_heel:",
					// womans boots
					":u1f462:", ":boot:",
					// t-shirt
					":u1f455:", ":shirt:", ":tshirt:",
					// necktie
					":u1f454:", ":necktie:",
					// womans clothes
					":u1f45a:", ":womans_clothes:",
					// dress
					":u1f457:", ":dress:",
					// running shirt with sash
					":u1f3bd:", ":running_shirt_with_sash:",
					// jeans
					":u1f456:", ":jeans:",
					// kimono
					":u1f458:", ":kimono:",
					// bikini
					":u1f459:", ":bikini:",
					// briefcase
					":u1f4bc:", ":briefcase:",
					// handbag
					":u1f45c:", ":handbag:",
					// pouch
					":u1f45d:", ":pouch:",
					// purse
					":u1f45b:", ":purse:",
					// eyeglasses
					":u1f453:", ":eyeglasses:",
					// ribbon
					":u1f380:", ":ribbon:",
					// closed umbrella
					":u1f302:", ":closed_umbrella:",
					// lipstick
					":u1f484:", ":lipstick:",
					// yellow heart
					":u1f49b:", ":yellow_heart:",
					// blue heart
					":u1f499:", ":blue_heart:",
					// purple heart
					":u1f49c:", ":purple_heart:",
					// green heart
					":u1f49a:", ":green_heart:",
					// heavy black heart
					":u2764:", ":heart:",
					// broken heart
					":u1f494:", ":broken_heart:",
					// growing heart
					":u1f497:", ":heartpulse:",
					// beating heart
					":u1f493:", ":heartbeat:",
					// two hearts
					":u1f495:", ":two_hearts:",
					// sparkling heart
					":u1f496:", ":sparkling_heart:",
					// revolving hearts
					":u1f49e:", ":revolving_hearts:",
					// heart with arrow
					":u1f498:", ":cupid:",
					// love letter
					":u1f48c:", ":love_letter:",
					// kiss mark
					":u1f48b:", ":kiss:",
					// ring
					":u1f48d:", ":ring:",
					// gem stone
					":u1f48e:", ":gem:",
					// bust in silhouette
					":u1f464:", ":bust_in_silhouette:",
					// busts in silhouette
					":u1f465:", ":busts_in_silhouette:",
					// speech balloon
					":u1f4ac:", ":speech_balloon:",
					// footprints
					":u1f463:", ":footprints:",
					// thought balloon
					":u1f4ad:", ":thought_balloon:",
					// dog face
					":u1f436:", ":dog:",
					// wolf face
					":u1f43a:", ":wolf:",
					// cat face
					":u1f431:", ":cat:",
					// mouse face
					":u1f42d:", ":mouse:",
					// hamster face
					":u1f439:", ":hamster:",
					// rabbit face
					":u1f430:", ":rabbit:",
					// frog face
					":u1f438:", ":frog:",
					// tiger face
					":u1f42f:", ":tiger:",
					// koala
					":u1f428:", ":koala:",
					// bear face
					":u1f43b:", ":bear:",
					// pig face
					":u1f437:", ":pig:",
					// pig nose
					":u1f43d:", ":pig_nose:",
					// cow face
					":u1f42e:", ":cow:",
					// boar
					":u1f417:", ":boar:",
					// monkey face
					":u1f435:", ":monkey_face:",
					// monkey
					":u1f412:", ":monkey:",
					// horse face
					":u1f434:", ":horse:",
					// sheep
					":u1f411:", ":sheep:",
					// elephant
					":u1f418:", ":elephant:",
					// panda face
					":u1f43c:", ":panda_face:",
					// penguin
					":u1f427:", ":penguin:",
					// bird
					":u1f426:", ":bird:",
					// baby chick
					":u1f424:", ":baby_chick:",
					// front-facing baby chick
					":u1f425:", ":hatched_chick:",
					// hatching chick
					":u1f423:", ":hatching_chick:",
					// chicken
					":u1f414:", ":chicken:",
					// snake
					":u1f40d:", ":snake:",
					// turtle
					":u1f422:", ":turtle:",
					// bug
					":u1f41b:", ":bug:",
					// honeybee
					":u1f41d:", ":bee:", ":honeybee:",
					// ant
					":u1f41c:", ":ant:",
					// lady beetle
					":u1f41e:", ":beetle:",
					// snail
					":u1f40c:", ":snail:",
					// octopus
					":u1f419:", ":octopus:",
					// spiral shell
					":u1f41a:", ":shell:",
					// tropical fish
					":u1f420:", ":tropical_fish:",
					// fish
					":u1f41f:", ":fish:",
					// dolphin
					":u1f42c:", ":dolphin:", ":flipper:",
					// spouting whale
					":u1f433:", ":whale:",
					// whale
					":u1f40b:", ":whale2:",
					// cow
					":u1f404:", ":cow2:",
					// ram
					":u1f40f:", ":ram:",
					// rat
					":u1f400:", ":rat:",
					// water buffalo
					":u1f403:", ":water_buffalo:",
					// tiger
					":u1f405:", ":tiger2:",
					// rabbit
					":u1f407:", ":rabbit2:",
					// dragon
					":u1f409:", ":dragon:",
					// horse
					":u1f40e:", ":racehorse:",
					// goat
					":u1f410:", ":goat:",
					// rooster
					":u1f413:", ":rooster:",
					// dog
					":u1f415:", ":dog2:",
					// pig
					":u1f416:", ":pig2:",
					// mouse
					":u1f401:", ":mouse2:",
					// ox
					":u1f402:", ":ox:",
					// dragon face
					":u1f432:", ":dragon_face:",
					// blowfish
					":u1f421:", ":blowfish:",
					// crocodile
					":u1f40a:", ":crocodile:",
					// bactrian camel
					":u1f42b:", ":camel:",
					// dromedary camel
					":u1f42a:", ":dromedary_camel:",
					// leopard
					":u1f406:", ":leopard:",
					// cat
					":u1f408:", ":cat2:",
					// poodle
					":u1f429:", ":poodle:",
					// paw prints
					":u1f43e:", ":feet:", ":paw_prints:",
					// bouquet
					":u1f490:", ":bouquet:",
					// cherry blossom
					":u1f338:", ":cherry_blossom:",
					// tulip
					":u1f337:", ":tulip:",
					// four leaf clover
					":u1f340:", ":four_leaf_clover:",
					// rose
					":u1f339:", ":rose:",
					// sunflower
					":u1f33b:", ":sunflower:",
					// hibiscus
					":u1f33a:", ":hibiscus:",
					// maple leaf
					":u1f341:", ":maple_leaf:",
					// leaf fluttering in wind
					":u1f343:", ":leaves:",
					// fallen leaf
					":u1f342:", ":fallen_leaf:",
					// herb
					":u1f33f:", ":herb:",
					// ear of rice
					":u1f33e:", ":ear_of_rice:",
					// mushroom
					":u1f344:", ":mushroom:",
					// cactus
					":u1f335:", ":cactus:",
					// palm tree
					":u1f334:", ":palm_tree:",
					// evergreen tree
					":u1f332:", ":evergreen_tree:",
					// deciduous tree
					":u1f333:", ":deciduous_tree:",
					// chestnut
					":u1f330:", ":chestnut:",
					// seedling
					":u1f331:", ":seedling:",
					// blossom
					":u1f33c:", ":blossom:",
					// globe with meridians
					":u1f310:", ":globe_with_meridians:",
					// sun with face
					":u1f31e:", ":sun_with_face:",
					// full moon with face
					":u1f31d:", ":full_moon_with_face:",
					// new moon with face
					":u1f31a:", ":new_moon_with_face:",
					// new moon symbol
					":u1f311:", ":new_moon:",
					// waxing crescent moon symbol
					":u1f312:", ":waxing_crescent_moon:",
					// first quarter moon symbol
					":u1f313:", ":first_quarter_moon:",
					// waxing gibbous moon symbol
					":u1f314:", ":moon:", ":waxing_gibbous_moon:",
					// full moon symbol
					":u1f315:", ":full_moon:",
					// waning gibbous moon symbol
					":u1f316:", ":waning_gibbous_moon:",
					// last quarter moon symbol
					":u1f317:", ":last_quarter_moon:",
					// waning crescent moon symbol
					":u1f318:", ":waning_crescent_moon:",
					// last quarter moon with face
					":u1f31c:", ":last_quarter_moon_with_face:",
					// first quarter moon with face
					":u1f31b:", ":first_quarter_moon_with_face:",
					// crescent moon
					":u1f319:", ":crescent_moon:",
					// earth globe europe-africa
					":u1f30d:", ":earth_africa:",
					// earth globe americas
					":u1f30e:", ":earth_americas:",
					// earth globe asia-australia
					":u1f30f:", ":earth_asia:",
					// volcano
					":u1f30b:", ":volcano:",
					// milky way
					":u1f30c:", ":milky_way:",
					// shooting star
					":u1f320:", ":stars:",
					// white medium star
					":u2b50:", ":star:",
					// black sun with rays
					":u2600:", ":sunny:",
					// sun behind cloud
					":u26c5:", ":partly_sunny:",
					// cloud
					":u2601:", ":cloud:",
					// high voltage sign
					":u26a1:", ":zap:",
					// umbrella with rain drops
					":u2614:", ":umbrella:",
					// snowflake
					":u2744:", ":snowflake:",
					// snowman without snow
					":u26c4:", ":snowman:",
					// cyclone
					":u1f300:", ":cyclone:",
					// foggy
					":u1f301:", ":foggy:",
					// rainbow
					":u1f308:", ":rainbow:",
					// water wave
					":u1f30a:", ":ocean:",
					// pine decoration
					":u1f38d:", ":bamboo:",
					// heart with ribbon
					":u1f49d:", ":gift_heart:",
					// japanese dolls
					":u1f38e:", ":dolls:",
					// school satchel
					":u1f392:", ":school_satchel:",
					// graduation cap
					":u1f393:", ":mortar_board:",
					// carp streamer
					":u1f38f:", ":flags:",
					// fireworks
					":u1f386:", ":fireworks:",
					// firework sparkler
					":u1f387:", ":sparkler:",
					// wind chime
					":u1f390:", ":wind_chime:",
					// moon viewing ceremony
					":u1f391:", ":rice_scene:",
					// jack-o-lantern
					":u1f383:", ":jack_o_lantern:",
					// ghost
					":u1f47b:", ":ghost:",
					// father christmas
					":u1f385:", ":santa:",
					// christmas tree
					":u1f384:", ":christmas_tree:",
					// wrapped present
					":u1f381:", ":gift:",
					// tanabata tree
					":u1f38b:", ":tanabata_tree:",
					// party popper
					":u1f389:", ":tada:",
					// confetti ball
					":u1f38a:", ":confetti_ball:",
					// balloon
					":u1f388:", ":balloon:",
					// crossed flags
					":u1f38c:", ":crossed_flags:",
					// crystal ball
					":u1f52e:", ":crystal_ball:",
					// movie camera
					":u1f3a5:", ":movie_camera:",
					// camera
					":u1f4f7:", ":camera:",
					// video camera
					":u1f4f9:", ":video_camera:",
					// videocassette
					":u1f4fc:", ":vhs:",
					// optical disc
					":u1f4bf:", ":cd:",
					// dvd
					":u1f4c0:", ":dvd:",
					// minidisc
					":u1f4bd:", ":minidisc:",
					// floppy disk
					":u1f4be:", ":floppy_disk:",
					// personal computer
					":u1f4bb:", ":computer:",
					// mobile phone
					":u1f4f1:", ":iphone:",
					// black telephone
					":u260e:", ":phone:", ":telephone:",
					// telephone receiver
					":u1f4de:", ":telephone_receiver:",
					// pager
					":u1f4df:", ":pager:",
					// fax machine
					":u1f4e0:", ":fax:",
					// satellite antenna
					":u1f4e1:", ":satellite:",
					// television
					":u1f4fa:", ":tv:",
					// radio
					":u1f4fb:", ":radio:",
					// speaker with three sound waves
					":u1f50a:", ":loud_sound:",
					// speaker with one sound wave
					":u1f509:", ":sound:",
					// speaker
					":u1f508:", ":speaker:",
					// speaker with cancellation stroke
					":u1f507:", ":mute:",
					// bell
					":u1f514:", ":bell:",
					// bell with cancellation stroke
					":u1f515:", ":no_bell:",
					// public address loudspeaker
					":u1f4e2:", ":loudspeaker:",
					// cheering megaphone
					":u1f4e3:", ":mega:",
					// hourglass with flowing sand
					":u23f3:", ":hourglass_flowing_sand:",
					// hourglass
					":u231b:", ":hourglass:",
					// alarm clock
					":u23f0:", ":alarm_clock:",
					// watch
					":u231a:", ":watch:",
					// open lock
					":u1f513:", ":unlock:",
					// lock
					":u1f512:", ":lock:",
					// lock with ink pen
					":u1f50f:", ":lock_with_ink_pen:",
					// closed lock with key
					":u1f510:", ":closed_lock_with_key:",
					// key
					":u1f511:", ":key:",
					// right-pointing magnifying glass
					":u1f50e:", ":mag_right:",
					// electric light bulb
					":u1f4a1:", ":bulb:",
					// electric torch
					":u1f526:", ":flashlight:",
					// high brightness symbol
					":u1f506:", ":high_brightness:",
					// low brightness symbol
					":u1f505:", ":low_brightness:",
					// electric plug
					":u1f50c:", ":electric_plug:",
					// battery
					":u1f50b:", ":battery:",
					// left-pointing magnifying glass
					":u1f50d:", ":mag:",
					// bathtub
					":u1f6c1:", ":bathtub:",
					// bath
					":u1f6c0:", ":bath:",
					// shower
					":u1f6bf:", ":shower:",
					// toilet
					":u1f6bd:", ":toilet:",
					// wrench
					":u1f527:", ":wrench:",
					// nut and bolt
					":u1f529:", ":nut_and_bolt:",
					// hammer
					":u1f528:", ":hammer:",
					// door
					":u1f6aa:", ":door:",
					// smoking symbol
					":u1f6ac:", ":smoking:",
					// bomb
					":u1f4a3:", ":bomb:",
					// pistol
					":u1f52b:", ":gun:",
					// hocho
					":u1f52a:", ":hocho:", ":knife:",
					// pill
					":u1f48a:", ":pill:",
					// syringe
					":u1f489:", ":syringe:",
					// money bag
					":u1f4b0:", ":moneybag:",
					// banknote with yen sign
					":u1f4b4:", ":yen:",
					// banknote with dollar sign
					":u1f4b5:", ":dollar:",
					// banknote with pound sign
					":u1f4b7:", ":pound:",
					// banknote with euro sign
					":u1f4b6:", ":euro:",
					// credit card
					":u1f4b3:", ":credit_card:",
					// money with wings
					":u1f4b8:", ":money_with_wings:",
					// mobile phone with rightwards arrow at left
					":u1f4f2:", ":calling:",
					// e-mail symbol
					":u1f4e7:", ":e-mail:",
					// inbox tray
					":u1f4e5:", ":inbox_tray:",
					// outbox tray
					":u1f4e4:", ":outbox_tray:",
					// envelope
					":u2709:", ":email:", ":envelope:",
					// envelope with downwards arrow above
					":u1f4e9:", ":envelope_with_arrow:",
					// incoming envelope
					":u1f4e8:", ":incoming_envelope:",
					// postal horn
					":u1f4ef:", ":postal_horn:",
					// closed mailbox with raised flag
					":u1f4eb:", ":mailbox:",
					// closed mailbox with lowered flag
					":u1f4ea:", ":mailbox_closed:",
					// open mailbox with raised flag
					":u1f4ec:", ":mailbox_with_mail:",
					// open mailbox with lowered flag
					":u1f4ed:", ":mailbox_with_no_mail:",
					// postbox
					":u1f4ee:", ":postbox:",
					// package
					":u1f4e6:", ":package:",
					// memo
					":u1f4dd:", ":memo:", ":pencil:",
					// page facing up
					":u1f4c4:", ":page_facing_up:",
					// page with curl
					":u1f4c3:", ":page_with_curl:",
					// bookmark tabs
					":u1f4d1:", ":bookmark_tabs:",
					// bar chart
					":u1f4ca:", ":bar_chart:",
					// chart with upwards trend
					":u1f4c8:", ":chart_with_upwards_trend:",
					// chart with downwards trend
					":u1f4c9:", ":chart_with_downwards_trend:",
					// scroll
					":u1f4dc:", ":scroll:",
					// clipboard
					":u1f4cb:", ":clipboard:",
					// calendar
					":u1f4c5:", ":date:",
					// tear-off calendar
					":u1f4c6:", ":calendar:",
					// card index
					":u1f4c7:", ":card_index:",
					// file folder
					":u1f4c1:", ":file_folder:",
					// open file folder
					":u1f4c2:", ":open_file_folder:",
					// black scissors
					":u2702:", ":scissors:",
					// pushpin
					":u1f4cc:", ":pushpin:",
					// paperclip
					":u1f4ce:", ":paperclip:",
					// black nib
					":u2712:", ":black_nib:",
					// pencil
					":u270f:", ":pencil2:",
					// straight ruler
					":u1f4cf:", ":straight_ruler:",
					// triangular ruler
					":u1f4d0:", ":triangular_ruler:",
					// closed book
					":u1f4d5:", ":closed_book:",
					// green book
					":u1f4d7:", ":green_book:",
					// blue book
					":u1f4d8:", ":blue_book:",
					// orange book
					":u1f4d9:", ":orange_book:",
					// notebook
					":u1f4d3:", ":notebook:",
					// notebook with decorative cover
					":u1f4d4:", ":notebook_with_decorative_cover:",
					// ledger
					":u1f4d2:", ":ledger:",
					// books
					":u1f4da:", ":books:",
					// open book
					":u1f4d6:", ":book:", ":open_book:",
					// bookmark
					":u1f516:", ":bookmark:",
					// name badge
					":u1f4db:", ":name_badge:",
					// microscope
					":u1f52c:", ":microscope:",
					// telescope
					":u1f52d:", ":telescope:",
					// newspaper
					":u1f4f0:", ":newspaper:",
					// artist palette
					":u1f3a8:", ":art:",
					// clapper board
					":u1f3ac:", ":clapper:",
					// microphone
					":u1f3a4:", ":microphone:",
					// headphone
					":u1f3a7:", ":headphones:",
					// musical score
					":u1f3bc:", ":musical_score:",
					// musical note
					":u1f3b5:", ":musical_note:",
					// multiple musical notes
					":u1f3b6:", ":notes:",
					// musical keyboard
					":u1f3b9:", ":musical_keyboard:",
					// violin
					":u1f3bb:", ":violin:",
					// trumpet
					":u1f3ba:", ":trumpet:",
					// saxophone
					":u1f3b7:", ":saxophone:",
					// guitar
					":u1f3b8:", ":guitar:",
					// alien monster
					":u1f47e:", ":space_invader:",
					// video game
					":u1f3ae:", ":video_game:",
					// playing card black joker
					":u1f0cf:", ":black_joker:",
					// flower playing cards
					":u1f3b4:", ":flower_playing_cards:",
					// mahjong tile red dragon
					":u1f004:", ":mahjong:",
					// game die
					":u1f3b2:", ":game_die:",
					// direct hit
					":u1f3af:", ":dart:",
					// american football
					":u1f3c8:", ":football:",
					// basketball and hoop
					":u1f3c0:", ":basketball:",
					// soccer ball
					":u26bd:", ":soccer:",
					// baseball
					":u26be:", ":baseball:",
					// tennis racquet and ball
					":u1f3be:", ":tennis:",
					// billiards
					":u1f3b1:", ":8ball:",
					// rugby football
					":u1f3c9:", ":rugby_football:",
					// bowling
					":u1f3b3:", ":bowling:",
					// flag in hole
					":u26f3:", ":golf:",
					// mountain bicyclist
					":u1f6b5:", ":mountain_bicyclist:",
					// bicyclist
					":u1f6b4:", ":bicyclist:",
					// chequered flag
					":u1f3c1:", ":checkered_flag:",
					// horse racing
					":u1f3c7:", ":horse_racing:",
					// trophy
					":u1f3c6:", ":trophy:",
					// ski and ski boot
					":u1f3bf:", ":ski:",
					// snowboarder
					":u1f3c2:", ":snowboarder:",
					// swimmer
					":u1f3ca:", ":swimmer:",
					// surfer
					":u1f3c4:", ":surfer:",
					// fishing pole and fish
					":u1f3a3:", ":fishing_pole_and_fish:",
					// hot beverage
					":u2615:", ":coffee:",
					// teacup without handle
					":u1f375:", ":tea:",
					// sake bottle and cup
					":u1f376:", ":sake:",
					// baby bottle
					":u1f37c:", ":baby_bottle:",
					// beer mug
					":u1f37a:", ":beer:",
					// clinking beer mugs
					":u1f37b:", ":beers:",
					// cocktail glass
					":u1f378:", ":cocktail:",
					// tropical drink
					":u1f379:", ":tropical_drink:",
					// wine glass
					":u1f377:", ":wine_glass:",
					// fork and knife
					":u1f374:", ":fork_and_knife:",
					// slice of pizza
					":u1f355:", ":pizza:",
					// hamburger
					":u1f354:", ":hamburger:",
					// french fries
					":u1f35f:", ":fries:",
					// poultry leg
					":u1f357:", ":poultry_leg:",
					// meat on bone
					":u1f356:", ":meat_on_bone:",
					// spaghetti
					":u1f35d:", ":spaghetti:",
					// curry and rice
					":u1f35b:", ":curry:",
					// fried shrimp
					":u1f364:", ":fried_shrimp:",
					// bento box
					":u1f371:", ":bento:",
					// sushi
					":u1f363:", ":sushi:",
					// fish cake with swirl design
					":u1f365:", ":fish_cake:",
					// rice ball
					":u1f359:", ":rice_ball:",
					// rice cracker
					":u1f358:", ":rice_cracker:",
					// cooked rice
					":u1f35a:", ":rice:",
					// steaming bowl
					":u1f35c:", ":ramen:",
					// pot of food
					":u1f372:", ":stew:",
					// oden
					":u1f362:", ":oden:",
					// dango
					":u1f361:", ":dango:",
					// cooking
					":u1f373:", ":egg:",
					// bread
					":u1f35e:", ":bread:",
					// doughnut
					":u1f369:", ":doughnut:",
					// custard
					":u1f36e:", ":custard:",
					// soft ice cream
					":u1f366:", ":icecream:",
					// ice cream
					":u1f368:", ":ice_cream:",
					// shaved ice
					":u1f367:", ":shaved_ice:",
					// birthday cake
					":u1f382:", ":birthday:",
					// shortcake
					":u1f370:", ":cake:",
					// cookie
					":u1f36a:", ":cookie:",
					// chocolate bar
					":u1f36b:", ":chocolate_bar:",
					// candy
					":u1f36c:", ":candy:",
					// lollipop
					":u1f36d:", ":lollipop:",
					// honey pot
					":u1f36f:", ":honey_pot:",
					// red apple
					":u1f34e:", ":apple:",
					// green apple
					":u1f34f:", ":green_apple:",
					// tangerine
					":u1f34a:", ":tangerine:",
					// lemon
					":u1f34b:", ":lemon:",
					// cherries
					":u1f352:", ":cherries:",
					// grapes
					":u1f347:", ":grapes:",
					// watermelon
					":u1f349:", ":watermelon:",
					// strawberry
					":u1f353:", ":strawberry:",
					// peach
					":u1f351:", ":peach:",
					// melon
					":u1f348:", ":melon:",
					// banana
					":u1f34c:", ":banana:",
					// pear
					":u1f350:", ":pear:",
					// pineapple
					":u1f34d:", ":pineapple:",
					// roasted sweet potato
					":u1f360:", ":sweet_potato:",
					// aubergine
					":u1f346:", ":eggplant:",
					// tomato
					":u1f345:", ":tomato:",
					// ear of maize
					":u1f33d:", ":corn:",
					// house building
					":u1f3e0:", ":house:",
					// house with garden
					":u1f3e1:", ":house_with_garden:",
					// school
					":u1f3eb:", ":school:",
					// office building
					":u1f3e2:", ":office:",
					// japanese post office
					":u1f3e3:", ":post_office:",
					// hospital
					":u1f3e5:", ":hospital:",
					// bank
					":u1f3e6:", ":bank:",
					// convenience store
					":u1f3ea:", ":convenience_store:",
					// love hotel
					":u1f3e9:", ":love_hotel:",
					// hotel
					":u1f3e8:", ":hotel:",
					// wedding
					":u1f492:", ":wedding:",
					// church
					":u26ea:", ":church:",
					// department store
					":u1f3ec:", ":department_store:",
					// european post office
					":u1f3e4:", ":european_post_office:",
					// sunset over buildings
					":u1f307:", ":city_sunrise:",
					// cityscape at dusk
					":u1f306:", ":city_sunset:",
					// japanese castle
					":u1f3ef:", ":japanese_castle:",
					// european castle
					":u1f3f0:", ":european_castle:",
					// tent
					":u26fa:", ":tent:",
					// factory
					":u1f3ed:", ":factory:",
					// tokyo tower
					":u1f5fc:", ":tokyo_tower:",
					// silhouette of japan
					":u1f5fe:", ":japan:",
					// mount fuji
					":u1f5fb:", ":mount_fuji:",
					// sunrise over mountains
					":u1f304:", ":sunrise_over_mountains:",
					// sunrise
					":u1f305:", ":sunrise:",
					// night with stars
					":u1f303:", ":night_with_stars:",
					// statue of liberty
					":u1f5fd:", ":statue_of_liberty:",
					// bridge at night
					":u1f309:", ":bridge_at_night:",
					// carousel horse
					":u1f3a0:", ":carousel_horse:",
					// ferris wheel
					":u1f3a1:", ":ferris_wheel:",
					// fountain
					":u26f2:", ":fountain:",
					// roller coaster
					":u1f3a2:", ":roller_coaster:",
					// ship
					":u1f6a2:", ":ship:",
					// sailboat
					":u26f5:", ":boat:", ":sailboat:",
					// speedboat
					":u1f6a4:", ":speedboat:",
					// rowboat
					":u1f6a3:", ":rowboat:",
					// anchor
					":u2693:", ":anchor:",
					// rocket
					":u1f680:", ":rocket:",
					// airplane
					":u2708:", ":airplane:",
					// seat
					":u1f4ba:", ":seat:",
					// helicopter
					":u1f681:", ":helicopter:",
					// steam locomotive
					":u1f682:", ":steam_locomotive:",
					// tram
					":u1f68a:", ":tram:",
					// station
					":u1f689:", ":station:",
					// mountain railway
					":u1f69e:", ":mountain_railway:",
					// train
					":u1f686:", ":train2:",
					// high-speed train
					":u1f684:", ":bullettrain_side:",
					// high-speed train with bullet nose
					":u1f685:", ":bullettrain_front:",
					// light rail
					":u1f688:", ":light_rail:",
					// metro
					":u1f687:", ":metro:",
					// monorail
					":u1f69d:", ":monorail:",
					// tram car
					":u1f68b:", ":train:",
					// railway car
					":u1f683:", ":railway_car:",
					// trolleybus
					":u1f68e:", ":trolleybus:",
					// bus
					":u1f68c:", ":bus:",
					// oncoming bus
					":u1f68d:", ":oncoming_bus:",
					// recreational vehicle
					":u1f699:", ":blue_car:",
					// oncoming automobile
					":u1f698:", ":oncoming_automobile:",
					// automobile
					":u1f697:", ":car:", ":red_car:",
					// taxi
					":u1f695:", ":taxi:",
					// oncoming taxi
					":u1f696:", ":oncoming_taxi:",
					// articulated lorry
					":u1f69b:", ":articulated_lorry:",
					// delivery truck
					":u1f69a:", ":truck:",
					// police cars revolving light
					":u1f6a8:", ":rotating_light:",
					// police car
					":u1f693:", ":police_car:",
					// oncoming police car
					":u1f694:", ":oncoming_police_car:",
					// fire engine
					":u1f692:", ":fire_engine:",
					// ambulance
					":u1f691:", ":ambulance:",
					// minibus
					":u1f690:", ":minibus:",
					// bicycle
					":u1f6b2:", ":bike:",
					// aerial tramway
					":u1f6a1:", ":aerial_tramway:",
					// suspension railway
					":u1f69f:", ":suspension_railway:",
					// mountain cableway
					":u1f6a0:", ":mountain_cableway:",
					// tractor
					":u1f69c:", ":tractor:",
					// barber pole
					":u1f488:", ":barber:",
					// bus stop
					":u1f68f:", ":busstop:",
					// ticket
					":u1f3ab:", ":ticket:",
					// vertical traffic light
					":u1f6a6:", ":vertical_traffic_light:",
					// horizontal traffic light
					":u1f6a5:", ":traffic_light:",
					// warning sign
					":u26a0:", ":warning:",
					// construction sign
					":u1f6a7:", ":construction:",
					// japanese symbol for beginner
					":u1f530:", ":beginner:",
					// fuel pump
					":u26fd:", ":fuelpump:",
					// izakaya lantern
					":u1f3ee:", ":izakaya_lantern:", ":lantern:",
					// slot machine
					":u1f3b0:", ":slot_machine:",
					// hot springs
					":u2668:", ":hotsprings:",
					// moyai
					":u1f5ff:", ":moyai:",
					// circus tent
					":u1f3aa:", ":circus_tent:",
					// performing arts
					":u1f3ad:", ":performing_arts:",
					// round pushpin
					":u1f4cd:", ":round_pushpin:",
					// triangular flag on post
					":u1f6a9:", ":triangular_flag_on_post:",
					// regional indicator symbol letter j + regional indicator symbol letter p
					":u1f1ef_1f1f5:", ":jp:",
					// regional indicator symbol letter k + regional indicator symbol letter r
					":u1f1f0_1f1f7:", ":kr:",
					// regional indicator symbol letter d + regional indicator symbol letter e
					":u1f1e9_1f1ea:", ":de:",
					// regional indicator symbol letter c + regional indicator symbol letter n
					":u1f1e8_1f1f3:", ":cn:",
					// regional indicator symbol letter u + regional indicator symbol letter s
					":u1f1fa_1f1f8:", ":us:",
					// regional indicator symbol letter f + regional indicator symbol letter r
					":u1f1eb_1f1f7:", ":fr:",
					// regional indicator symbol letter e + regional indicator symbol letter s
					":u1f1ea_1f1f8:", ":es:",
					// regional indicator symbol letter i + regional indicator symbol letter t
					":u1f1ee_1f1f9:", ":it:",
					// regional indicator symbol letter r + regional indicator symbol letter u
					":u1f1f7_1f1fa:", ":ru:",
					// regional indicator symbol letter g + regional indicator symbol letter b
					":u1f1ec_1f1e7:", ":gb:", ":uk:",
					// digit one + combining enclosing keycap
					":u0031_20e3:", ":one:",
					// digit two + combining enclosing keycap
					":u0032_20e3:", ":two:",
					// digit three + combining enclosing keycap
					":u0033_20e3:", ":three:",
					// digit four + combining enclosing keycap
					":u0034_20e3:", ":four:",
					// digit five + combining enclosing keycap
					":u0035_20e3:", ":five:",
					// digit six + combining enclosing keycap
					":u0036_20e3:", ":six:",
					// digit seven + combining enclosing keycap
					":u0037_20e3:", ":seven:",
					// digit eight + combining enclosing keycap
					":u0038_20e3:", ":eight:",
					// digit nine + combining enclosing keycap
					":u0039_20e3:", ":nine:",
					// digit zero + combining enclosing keycap
					":u0030_20e3:", ":zero:",
					// keycap ten
					":u1f51f:", ":keycap_ten:",
					// input symbol for numbers
					":u1f522:", ":1234:",
					// number sign + combining enclosing keycap
					":u0023_20e3:", ":hash:",
					// input symbol for symbols
					":u1f523:", ":symbols:",
					// upwards black arrow
					":u2b06:", ":arrow_up:",
					// downwards black arrow
					":u2b07:", ":arrow_down:",
					// leftwards black arrow
					":u2b05:", ":arrow_left:",
					// black rightwards arrow
					":u27a1:", ":arrow_right:",
					// input symbol for latin capital letters
					":u1f520:", ":capital_abcd:",
					// input symbol for latin small letters
					":u1f521:", ":abcd:",
					// input symbol for latin letters
					":u1f524:", ":abc:",
					// north east arrow
					":u2197:", ":arrow_upper_right:",
					// north west arrow
					":u2196:", ":arrow_upper_left:",
					// south east arrow
					":u2198:", ":arrow_lower_right:",
					// south west arrow
					":u2199:", ":arrow_lower_left:",
					// left right arrow
					":u2194:", ":left_right_arrow:",
					// up down arrow
					":u2195:", ":arrow_up_down:",
					// anticlockwise downwards and upwards open circle arrows
					":u1f504:", ":arrows_counterclockwise:",
					// black left-pointing triangle
					":u25c0:", ":arrow_backward:",
					// black right-pointing triangle
					":u25b6:", ":arrow_forward:",
					// up-pointing small red triangle
					":u1f53c:", ":arrow_up_small:",
					// down-pointing small red triangle
					":u1f53d:", ":arrow_down_small:",
					// leftwards arrow with hook
					":u21a9:", ":leftwards_arrow_with_hook:",
					// rightwards arrow with hook
					":u21aa:", ":arrow_right_hook:",
					// information source
					":u2139:", ":information_source:",
					// black left-pointing double triangle
					":u23ea:", ":rewind:",
					// black right-pointing double triangle
					":u23e9:", ":fast_forward:",
					// black up-pointing double triangle
					":u23eb:", ":arrow_double_up:",
					// black down-pointing double triangle
					":u23ec:", ":arrow_double_down:",
					// arrow pointing rightwards then curving downwards
					":u2935:", ":arrow_heading_down:",
					// arrow pointing rightwards then curving upwards
					":u2934:", ":arrow_heading_up:",
					// squared ok
					":u1f197:", ":ok:",
					// twisted rightwards arrows
					":u1f500:", ":twisted_rightwards_arrows:",
					// clockwise rightwards and leftwards open circle arrows
					":u1f501:", ":repeat:",
					// clockwise rightwards and leftwards open circle arrows with circled one overlay
					":u1f502:", ":repeat_one:",
					// squared new
					":u1f195:", ":new:",
					// squared up with exclamation mark
					":u1f199:", ":up:",
					// squared cool
					":u1f192:", ":cool:",
					// squared free
					":u1f193:", ":free:",
					// squared ng
					":u1f196:", ":ng:",
					// antenna with bars
					":u1f4f6:", ":signal_strength:",
					// cinema
					":u1f3a6:", ":cinema:",
					// squared katakana koko
					":u1f201:", ":koko:",
					// squared cjk unified ideograph-6307
					":u1f22f:", ":u6307:",
					// squared cjk unified ideograph-7a7a
					":u1f233:", ":u7a7a:",
					// squared cjk unified ideograph-6e80
					":u1f235:", ":u6e80:",
					// squared cjk unified ideograph-5408
					":u1f234:", ":u5408:",
					// squared cjk unified ideograph-7981
					":u1f232:", ":u7981:",
					// circled ideograph advantage
					":u1f250:", ":ideograph_advantage:",
					// squared cjk unified ideograph-5272
					":u1f239:", ":u5272:",
					// squared cjk unified ideograph-55b6
					":u1f23a:", ":u55b6:",
					// squared cjk unified ideograph-6709
					":u1f236:", ":u6709:",
					// squared cjk unified ideograph-7121
					":u1f21a:", ":u7121:",
					// restroom
					":u1f6bb:", ":restroom:",
					// mens symbol
					":u1f6b9:", ":mens:",
					// womens symbol
					":u1f6ba:", ":womens:",
					// baby symbol
					":u1f6bc:", ":baby_symbol:",
					// water closet
					":u1f6be:", ":wc:",
					// potable water symbol
					":u1f6b0:", ":potable_water:",
					// put litter in its place symbol
					":u1f6ae:", ":put_litter_in_its_place:",
					// negative squared latin capital letter p
					":u1f17f:", ":parking:",
					// wheelchair symbol
					":u267f:", ":wheelchair:",
					// no smoking symbol
					":u1f6ad:", ":no_smoking:",
					// squared cjk unified ideograph-6708
					":u1f237:", ":u6708:",
					// squared cjk unified ideograph-7533
					":u1f238:", ":u7533:",
					// squared katakana sa
					":u1f202:", ":sa:",
					// circled latin capital letter m
					":u24c2:", ":m:",
					// passport control
					":u1f6c2:", ":passport_control:",
					// baggage claim
					":u1f6c4:", ":baggage_claim:",
					// left luggage
					":u1f6c5:", ":left_luggage:",
					// customs
					":u1f6c3:", ":customs:",
					// circled ideograph accept
					":u1f251:", ":accept:",
					// circled ideograph secret
					":u3299:", ":secret:",
					// circled ideograph congratulation
					":u3297:", ":congratulations:",
					// squared cl
					":u1f191:", ":cl:",
					// squared sos
					":u1f198:", ":sos:",
					// squared id
					":u1f194:", ":id:",
					// no entry sign
					":u1f6ab:", ":no_entry_sign:",
					// no one under eighteen symbol
					":u1f51e:", ":underage:",
					// no mobile phones
					":u1f4f5:", ":no_mobile_phones:",
					// do not litter symbol
					":u1f6af:", ":do_not_litter:",
					// non-potable water symbol
					":u1f6b1:", ":non-potable_water:",
					// no bicycles
					":u1f6b3:", ":no_bicycles:",
					// no pedestrians
					":u1f6b7:", ":no_pedestrians:",
					// children crossing
					":u1f6b8:", ":children_crossing:",
					// no entry
					":u26d4:", ":no_entry:",
					// eight spoked asterisk
					":u2733:", ":eight_spoked_asterisk:",
					// sparkle
					":u2747:", ":sparkle:",
					// negative squared cross mark
					":u274e:", ":negative_squared_cross_mark:",
					// white heavy check mark
					":u2705:", ":white_check_mark:",
					// eight pointed black star
					":u2734:", ":eight_pointed_black_star:",
					// heart decoration
					":u1f49f:", ":heart_decoration:",
					// squared vs
					":u1f19a:", ":vs:",
					// vibration mode
					":u1f4f3:", ":vibration_mode:",
					// mobile phone off
					":u1f4f4:", ":mobile_phone_off:",
					// negative squared latin capital letter a
					":u1f170:", ":a:",
					// negative squared latin capital letter b
					":u1f171:", ":b:",
					// negative squared ab
					":u1f18e:", ":ab:",
					// negative squared latin capital letter o
					":u1f17e:", ":o2:",
					// diamond shape with a dot inside
					":u1f4a0:", ":diamond_shape_with_a_dot_inside:",
					// double curly loop
					":u27bf:", ":loop:",
					// black universal recycling symbol
					":u267b:", ":recycle:",
					// aries
					":u2648:", ":aries:",
					// taurus
					":u2649:", ":taurus:",
					// gemini
					":u264a:", ":gemini:",
					// cancer
					":u264b:", ":cancer:",
					// leo
					":u264c:", ":leo:",
					// virgo
					":u264d:", ":virgo:",
					// libra
					":u264e:", ":libra:",
					// scorpius
					":u264f:", ":scorpius:",
					// sagittarius
					":u2650:", ":sagittarius:",
					// capricorn
					":u2651:", ":capricorn:",
					// aquarius
					":u2652:", ":aquarius:",
					// pisces
					":u2653:", ":pisces:",
					// ophiuchus
					":u26ce:", ":ophiuchus:",
					// six pointed star with middle dot
					":u1f52f:", ":six_pointed_star:",
					// automated teller machine
					":u1f3e7:", ":atm:",
					// chart with upwards trend and yen sign
					":u1f4b9:", ":chart:",
					// heavy dollar sign
					":u1f4b2:", ":heavy_dollar_sign:",
					// currency exchange
					":u1f4b1:", ":currency_exchange:",
					// copyright sign
					":u00a9:", ":copyright:",
					// registered sign
					":u00ae:", ":registered:",
					// trade mark sign
					":u2122:", ":tm:",
					// cross mark
					":u274c:", ":x:",
					// double exclamation mark
					":u203c:", ":bangbang:",
					// exclamation question mark
					":u2049:", ":interrobang:",
					// heavy exclamation mark symbol
					":u2757:", ":exclamation:", ":heavy_exclamation_mark:",
					// black question mark ornament
					":u2753:", ":question:",
					// white exclamation mark ornament
					":u2755:", ":grey_exclamation:",
					// white question mark ornament
					":u2754:", ":grey_question:",
					// heavy large circle
					":u2b55:", ":o:",
					// top with upwards arrow above
					":u1f51d:", ":top:",
					// end with leftwards arrow above
					":u1f51a:", ":end:",
					// back with leftwards arrow above
					":u1f519:", ":back:",
					// on with exclamation mark with left right arrow above
					":u1f51b:", ":on:",
					// soon with rightwards arrow above
					":u1f51c:", ":soon:",
					// clockwise downwards and upwards open circle arrows
					":u1f503:", ":arrows_clockwise:",
					// clock face twelve oclock
					":u1f55b:", ":clock12:",
					// clock face twelve-thirty
					":u1f567:", ":clock1230:",
					// clock face one oclock
					":u1f550:", ":clock1:",
					// clock face one-thirty
					":u1f55c:", ":clock130:",
					// clock face two oclock
					":u1f551:", ":clock2:",
					// clock face two-thirty
					":u1f55d:", ":clock230:",
					// clock face three oclock
					":u1f552:", ":clock3:",
					// clock face three-thirty
					":u1f55e:", ":clock330:",
					// clock face four oclock
					":u1f553:", ":clock4:",
					// clock face four-thirty
					":u1f55f:", ":clock430:",
					// clock face five oclock
					":u1f554:", ":clock5:",
					// clock face five-thirty
					":u1f560:", ":clock530:",
					// clock face six oclock
					":u1f555:", ":clock6:",
					// clock face seven oclock
					":u1f556:", ":clock7:",
					// clock face eight oclock
					":u1f557:", ":clock8:",
					// clock face nine oclock
					":u1f558:", ":clock9:",
					// clock face ten oclock
					":u1f559:", ":clock10:",
					// clock face eleven oclock
					":u1f55a:", ":clock11:",
					// clock face six-thirty
					":u1f561:", ":clock630:",
					// clock face seven-thirty
					":u1f562:", ":clock730:",
					// clock face eight-thirty
					":u1f563:", ":clock830:",
					// clock face nine-thirty
					":u1f564:", ":clock930:",
					// clock face ten-thirty
					":u1f565:", ":clock1030:",
					// clock face eleven-thirty
					":u1f566:", ":clock1130:",
					// heavy multiplication x
					":u2716:", ":heavy_multiplication_x:",
					// heavy plus sign
					":u2795:", ":heavy_plus_sign:",
					// heavy minus sign
					":u2796:", ":heavy_minus_sign:",
					// heavy division sign
					":u2797:", ":heavy_division_sign:",
					// black spade suit
					":u2660:", ":spades:",
					// black heart suit
					":u2665:", ":hearts:",
					// black club suit
					":u2663:", ":clubs:",
					// black diamond suit
					":u2666:", ":diamonds:",
					// white flower
					":u1f4ae:", ":white_flower:",
					// hundred points symbol
					":u1f4af:", ":100:",
					// heavy check mark
					":u2714:", ":heavy_check_mark:",
					// ballot box with check
					":u2611:", ":ballot_box_with_check:",
					// radio button
					":u1f518:", ":radio_button:",
					// link symbol
					":u1f517:", ":link:",
					// curly loop
					":u27b0:", ":curly_loop:",
					// wavy dash
					":u3030:", ":wavy_dash:",
					// part alternation mark
					":u303d:", ":part_alternation_mark:",
					// trident emblem
					":u1f531:", ":trident:",
					// black medium square
					":u25fc:", ":black_medium_square:",
					// white medium square
					":u25fb:", ":white_medium_square:",
					// black medium small square
					":u25fe:", ":black_medium_small_square:",
					// white medium small square
					":u25fd:", ":white_medium_small_square:",
					// black small square
					":u25aa:", ":black_small_square:",
					// white small square
					":u25ab:", ":white_small_square:",
					// up-pointing red triangle
					":u1f53a:", ":small_red_triangle:",
					// black square button
					":u1f532:", ":black_square_button:",
					// white square button
					":u1f533:", ":white_square_button:",
					// medium black circle
					":u26ab:", ":black_circle:",
					// medium white circle
					":u26aa:", ":white_circle:",
					// large red circle
					":u1f534:", ":red_circle:",
					// large blue circle
					":u1f535:", ":large_blue_circle:",
					// down-pointing red triangle
					":u1f53b:", ":small_red_triangle_down:",
					// white large square
					":u2b1c:", ":white_large_square:",
					// black large square
					":u2b1b:", ":black_large_square:",
					// large orange diamond
					":u1f536:", ":large_orange_diamond:",
					// large blue diamond
					":u1f537:", ":large_blue_diamond:",
					// small orange diamond
					":u1f538:", ":small_orange_diamond:",
					// small blue diamond
					":u1f539:", ":small_blue_diamond:"));
		}
		return keywords;
	}

	public Emoji setTheme (String themeName, final Ready ready) {
		if (instance == null && themeName == null) {
			themeName = "apple";
		}

		if (themeName != null && !currentThemeName.equals(themeName)) {
			currentThemeName = themeName;
			
			GWT.runAsync(new RunAsyncCallback() {

				@Override
				public void onSuccess () {
					instance = ThemeFactory.getTheme(currentThemeName);

					if (ready != null) {
						ready.ready(Emoji.this);
					}
				}

				@Override
				public void onFailure (Throwable reason) {}
			});

		} else {
			if (ready != null) {
				ready.ready(this);
			}
		}

		return this;
	}
}