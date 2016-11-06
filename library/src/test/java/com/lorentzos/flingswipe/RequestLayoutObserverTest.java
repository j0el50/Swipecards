package com.lorentzos.flingswipe;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

/**
 * Tests for {@link RequestLayoutObserver}
 */
@RunWith(MockitoJUnitRunner.class)
public class RequestLayoutObserverTest {

	@Mock
	private SwipeAdapterView mockSwipeAdapterView;
	private RequestLayoutObserver layoutObserver;

	@Before
	public void setUp() throws Exception {
		layoutObserver = new RequestLayoutObserver(mockSwipeAdapterView);
	}

	@Test
	public void changed() throws Exception {
		// Given

		// When
		layoutObserver.onChanged();

		// Then
		verify(mockSwipeAdapterView).requestLayout();
	}

	@Test
	public void invalidated() throws Exception {
		// Given

		// When
		layoutObserver.onInvalidated();

		// Then
		verify(mockSwipeAdapterView).requestLayout();
	}
}