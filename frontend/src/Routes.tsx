import DashBoard from 'Pages/DashBoard';
import Home from 'Pages/Home'
import {BrowserRouter, Route, Switch} from 'react-router-dom'

const Routes = () => {
    return(
      <BrowserRouter>
        <Switch>
            <Route path="/" exact><Home/></Route>
        </Switch>
        <Switch>
            <Route path="/dashboard" exact><DashBoard/></Route>
        </Switch>
      </BrowserRouter>
    );
}
export default Routes;