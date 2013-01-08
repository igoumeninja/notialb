/*
Start the setup for the new track.

----example-------

~test = SendTags.new;
~test.dests = [Dests.vagosAddr, Dests.arisAddr, Dests.alexAddr];
~test.title = '/tags';
~test.tags = [1, 2, 3, 4];
~test.step = [0.50];
~test.times = inf;
~test.loop;
~test.stop;
~test.atEnd
~test.immediate

~testResp1 = RespTags.do('/tags', 1, nil);
~testResp1.action = {"testTag: 1".postln};
*/

TrackToo{
	*load {
		TrackToo_0.load;
		TrackToo_1.load;
		TrackToo_2.load;
	}
	*playAll {
		TrackToo_0.loop;
	}
	*play_0 {
		NilTheCounters.load;
		TrackToo_0.loop;
	}
	*play_1 {
		NilTheCounters.load;
		TrackToo_1.loop;
	}
	*play_2 {
		NilTheCounters.load;
		TrackToo_2.loop;
	}
}

TrackToo_0{
	*load {
		"Load stuff for TrackToo_0".postln;
	}
	*play_0 {
		"Play TrackToo_0".postln;
	}
}

TrackToo_1{
	*load {
		"Load stuff for TrackToo_1".postln;
	}
	*play_0 {
		"Play TrackToo_1".postln;
	}
}

TrackToo_2{
	*load {
		"Load stuff for TrackToo_2".postln;
	}
	*play_0 {
		"Play TrackToo_2".postln;
	}
}
