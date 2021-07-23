import { Route, BrowserRouter as Router } from 'react-router-dom';

import Home from '../pages/Home';
import About from '../pages/About';


const Routes = () => {

    return (
        <Router>
            <Route component={Home} exact path="/" />
            <Route component={About} path="/about" />
        </Router>
    )
}

export default Routes;